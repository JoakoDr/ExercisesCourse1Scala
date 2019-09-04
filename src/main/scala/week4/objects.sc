abstract class Nat {
  def isZero:Boolean
  def predecessor: Nat
  def succesor = new Succ()
  def +(that: Nat):Nat
  def -(that: Nat):Nat

}

object Zero extends Nat {
  def isZero = true
  def predecessor = throw new Error("0.predecesor")
  def +(that: Nat) = that
  def -(that: Nat) = if (that.isZero) this else throw new Error("0.negativo")
}


class Succ(n: Nat) extends Nat {
  def isZero = false
  def predecessor = n
  def +(that: Nat) = new Succ(n + that)
  def -(that: Nat) = if (that.isZero) this else n - that.predecessor
}