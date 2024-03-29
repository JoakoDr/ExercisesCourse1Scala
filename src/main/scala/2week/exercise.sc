import math.abs

object exercise {
  val tolerance = 0.0001
  def isCloseEnough(x:Double, y:Double) =
    abs((x-y)/x)/x < tolerance
  def fixedPoint(f:Double => Double)(firstGuest: Double) = {
    def iterate(guess:Double):Double = {
      println("Guess = "+guess)
      val next = f(guess)
      if (isCloseEnough(guess,next)) next
      else iterate(next)
    }
    iterate(firstGuest)
  }
fixedPoint(x => 1 + x/2)(1)
  def averagePoint(f:Double => Double)(x:Double) = (x + f(x)) / 2
  def sqrt(x:Double) = fixedPoint(averagePoint(y => x/y))(1)
}