package fractals

// TODO - consider defining a common trait if more algorithms are defined
// TODO - make the radius e.g ±2 configurable to support zoom
class Mandelbrot(
  iterations: Int,
  width: Int,
  height: Int) {

  def calculate(x: Int, y: Int) = {

    // TODO - consider using extension methods
    val px = scaleX(x)
    val py = scaleY(y)

    def loop(z: Double, i: Int): Int = {
      0
    }

    loop(0, 0)
  }

  // Map pixel x value to point in mandelbrot search space
  def scaleX(x: Int) = ((x.toDouble/width)*4) - 2

  // Map pixel y component to point in mandelbrot search space
  def scaleY(y: Int) = 2 - ((y.toDouble/height)*4)

}

object Mandelbrot {
  val DefaultIterations = 1000
  def apply(
    iterations: Int = DefaultIterations,
    width: Int,
    height: Int
  ) = new Mandelbrot(iterations, width, height)
}
