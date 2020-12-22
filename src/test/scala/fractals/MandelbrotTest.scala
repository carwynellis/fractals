package fractals

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MandelbrotTest extends AnyFunSuite with Matchers {

  private def underTest = new Mandelbrot(
    iterations = 10,
    width = 9,
    height = 9
  )

  test("should compute correct value for top left pixel") {
    underTest.calculate(0, 0) shouldBe 1
  }

  test("should compute correct value for pixel 1, 2") {
    underTest.calculate(1, 2) shouldBe 2
  }

}
