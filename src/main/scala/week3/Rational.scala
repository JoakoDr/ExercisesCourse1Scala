package week3

class Rational(x:Int,y:Int) {
  require(y != 0, "denominator must be nonzero")
  def this(x:Int) = this(x, 1)
  def numer = x
  def denom = y
  def +(that: Rational) = new Rational(numer * that.denom + that.numer * denom,
    denom * that.denom)
  override def toString = {
    val g = gcd(numer,denom)
    numer/g + "/" + denom/g
  }
  def unary_- : Rational = new Rational(-numer,denom)
  def -(that:Rational) =this + -that
  private def gcd(a:Int,b:Int):Int = if(b==0) a else
    gcd(b, a%b)
  private val g = gcd(x,y)
  def <(that:Rational) = numer * that.denom < that.numer * denom
  def max(that:Rational) = if (this < that) that else this
}

object rationals {
  val x = new Rational(1,2)
  x.denom
  x.numer

}
