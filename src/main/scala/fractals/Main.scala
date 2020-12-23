package fractals

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO
import scala.collection.parallel.CollectionConverters.ImmutableIterableIsParallelizable

object Main extends App {

  private val Width = 8000
  private val Height = 8000
  private val PngFormat = "png" // TODO - are there constants for these?
  private val Iterations = 500

  private val mandelbrot = Mandelbrot(
    iterations = Iterations, // TODO - cheating for now
    width = Width,
    height = Height
  )

  try {
    val image = new BufferedImage(Width, Height, BufferedImage.TYPE_INT_RGB)

    println("Rendering image")

    (0 until Width).to(LazyList).foreach(x => {
      (0 until Height).to(LazyList).par.foreach(y => {
        image.setRGB(x, y, computeColor(x, y).getRGB)
      })
    })

    println("Dome")

    val imageFile = new File("image.png")
    ImageIO.write(image, PngFormat, imageFile)
  }
  catch {
    case e: Exception => println(s"Caught exception: $e")
  }

  private def computeColor(x: Int, y: Int) = {
    val iterations = mandelbrot.calculate(x, y)
    val intensity = 255 - ((iterations.toDouble/Iterations)*255).toInt
    new Color(intensity, intensity, intensity)
  }
}
