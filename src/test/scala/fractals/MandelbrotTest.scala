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

  test("scaleX should return correct minimum value") {
    underTest.scaleX(0) shouldBe -2
  }

  test("scaleX should return correct maximum value") {
    underTest.scaleX(8) shouldBe 2
  }

  test("scaleY should return correct minimum value") {
    underTest.scaleY(8) shouldBe -2
  }

  test("scaleY should return correct maximum value") {
    underTest.scaleY(0) shouldBe 2
  }

}
