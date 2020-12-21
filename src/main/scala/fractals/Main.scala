package fractals

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

object Main extends App {

  private val Width = 640
  private val Height = 480

  // Initial test bed for image writing code
  try {
    val image = new BufferedImage(Width, Height, BufferedImage.TYPE_INT_RGB)
    val outputFile = new File("image.png")
    ImageIO.write(image, "png", outputFile)
  }
  catch {
    case e: Exception => println(s"Caught exception: $e")
  }
}
