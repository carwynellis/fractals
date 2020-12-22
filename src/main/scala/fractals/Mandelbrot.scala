package fractals

import scala.annotation.tailrec

// TODO - consider defining a common trait if more algorithms are defined
// TODO - make the radius e.g ±2 configurable to support zoom
class Mandelbrot(
  iterations: Int,
  width: Int,
  height: Int) {

  def calculate(x: Int, y: Int) = {

    val px = scaleX(x)
    val py = scaleY(y)

    val c = ComplexNumber(px, py)

    @tailrec
    def loop(z: ComplexNumber, i: Int): Int = {
      if (i > iterations) i
      else {
        val z1 = (z * z) + c
        if (z1.abs > 2) i
        else loop(z1, i + 1)
      }
    }

    loop(ComplexNumber(0, 0), 1)
  }

  // Map pixel x value to point in mandelbrot search space
  def scaleX(x: Int) = ((x.toDouble/(width-1))*4) - 2

  // Map pixel y component to point in mandelbrot search space
  def scaleY(y: Int) = 2 - ((y.toDouble/(height-1))*4)

}

object Mandelbrot {
  val DefaultIterations = 1000
  def apply(
    iterations: Int = DefaultIterations,
    width: Int,
    height: Int
  ) = new Mandelbrot(iterations, width, height)
}
