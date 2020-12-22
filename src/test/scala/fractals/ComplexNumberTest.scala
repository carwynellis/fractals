package fractals

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ComplexNumberTest extends AnyFunSuite with Matchers {

  test("should compute square correctly") {
    val c = ComplexNumber(3.0, 4.0)
    c.square shouldBe 25
  }

  test("should compute abs correctly") {
    val c = ComplexNumber(3.0, 4.0)
    c.abs shouldBe 5
  }

}
