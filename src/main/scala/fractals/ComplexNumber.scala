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

    // TODO - this looks a little like the vec3 math - review
    def square: Double = (r * r) + (i * i)

    def abs: Double = math.sqrt(square)

}
