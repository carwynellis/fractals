package fractals

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

object Main extends App {

  private val Width = 640
  private val Height = 480
  private val PngFormat = "png" // TODO - are there constants for these?

  // Initial test bed for image writing code
  try {
    val image = new BufferedImage(Width, Height, BufferedImage.TYPE_INT_RGB)

    // Initial attempt at writing image data
    // TODO - review RGB parameter
    val coords = for {
      x <- 0 until Width
      y <- 0 until Height
    } yield(x, y)

    coords.foreach(p => image.setRGB(p._1, p._2, 1000))

    val imageFile = new File("image.png")
    ImageIO.write(image, PngFormat, imageFile)
  }
  catch {
    case e: Exception => println(s"Caught exception: $e")
  }
}
