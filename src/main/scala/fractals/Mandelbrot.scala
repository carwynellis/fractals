package fractals

// TODO - consider defining a common trait if more algorithms are defined
class Mandelbrot(iterations: Int, width: Int, height: Int) {

  def calculate(x: Int, y: Int) = {

    // TODO - scale x and y

    def loop(z: Double, i: Int): Int = {
      0
    }

    loop(0, 0)
  }

}

object Mandelbrot {
  val DefaultIterations = 1000
  def apply(
    iterations: Int = DefaultIterations,
    width: Int,
    height: Int
  ) = new Mandelbrot(iterations, width, height)
}
