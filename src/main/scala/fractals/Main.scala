package fractals

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

object Main extends App {

  private val Width = 4000
  private val Height = 4000
  private val PngFormat = "png" // TODO - are there constants for these?
  private val Iterations = 500

  private val mandelbrot = Mandelbrot(
    iterations = Iterations, // TODO - cheating for now
    width = Width,
    height = Height
  )

  // Initial test bed for image writing code
  try {
    val image = new BufferedImage(Width, Height, BufferedImage.TYPE_INT_RGB)

    // Initial attempt at writing image data
    val coords = for {
      x <- 0 until Width
      y <- 0 until Height
    } yield(x, y)

    coords.foreach(p => image.setRGB(p._1, p._2, computeColor(p._1, p._2).getRGB))

    val imageFile = new File("image.png")
    ImageIO.write(image, PngFormat, imageFile)
  }
  catch {
    case e: Exception => println(s"Caught exception: $e")
  }

//  private def computeColor(x: Int, y: Int) = {
//    val intensity = Math.ceil((y/Height.toDouble)*255).toInt
//    new Color(intensity, intensity, intensity)
//  }

  private def computeColor(x: Int, y: Int) = {
    val iterations = mandelbrot.calculate(x, y)
    val intensity = 255 - ((iterations.toDouble/Iterations)*255).toInt
    new Color(intensity, intensity, intensity)
  }
}
