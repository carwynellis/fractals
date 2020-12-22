package fractals

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MandelbrotTest extends AnyFunSuite with Matchers {

  private def underTest = new Mandelbrot(10, 4, 4)

  test("should compute correct value for top left pixel") {
    underTest.calculate(0, 0) shouldBe 0
  }

}
