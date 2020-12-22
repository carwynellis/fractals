package fractals

/**
 * Representation of a complex number e.g.
 *
 *  c = r + (i * sqrt(-1))
 *
 * @param r
 * @param i
 */
case class ComplexNumber(r: Double, i: Double) {

    def absSquared: Double = (r * r) + (i * i)

    def abs: Double = math.sqrt(absSquared)

    def +(that: ComplexNumber) = ComplexNumber(
        r = this.r + that.r,
        i = this.i + that.i
    )

    def *(that: ComplexNumber) = ComplexNumber(
        r = (this.r * that.r) - (this.i * that.i),
        i = (this.r * that.i) + (this.i * that.r)
    )

}
