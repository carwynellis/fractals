package fractals

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ComplexNumberTest extends AnyFunSuite with Matchers {

  test("should compute absSquared correctly") {
    val c = ComplexNumber(3.0, 4.0)
    c.absSquared shouldBe 25
  }

  test("should compute abs correctly") {
    val c = ComplexNumber(3.0, 4.0)
    c.abs shouldBe 5
  }

  test("should add two complex numbers correctly") {
    val a = ComplexNumber(1.0, 2.0)
    val b = ComplexNumber(3.0, 4.0)
    a + b shouldBe ComplexNumber(4.0, 6.0)
  }

  test("should multiply two complex numbers correctly") {
    val c = ComplexNumber(-1.5, 1)
    c * c shouldBe ComplexNumber(1.25, -3)
  }

}
