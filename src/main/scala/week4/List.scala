package week4

trait List[+T] {
def isEmpty:Boolean
  def head: T
  def tail: List[T]
  def singleton[T](elem: T) = new Cons[T](elem,???)
  singleton(1)
  singleton("Keloke")
}
class Cons[T](val head: T, val tail: List[T]) extends List[T] {
   def isEmpty: Boolean = false
}
object Nil extends List[Nothing] {
  def isEmpty: Boolean = true

  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}
object List {
  def createEmpty[T]() = ???
  def create1[T](n: T) = new Cons(n,???)
  def create2[T](n:T,n1:T): List[T] = new Cons(n,new Cons(n1, ???))
  /*def isort(xs: List[Int]): List[Int] = xs match {
    case List() =>List()
    case y :: ys => insert(y,isort(ys))
  }
  def insert(x: Int, xs: List[Int]) = xs match {
    case List() => true
    case  y::ys => new Cons(y,new Cons(ys,new Nil))

  }*/
}
