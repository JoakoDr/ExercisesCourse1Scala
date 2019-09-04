import math.Ordering
object Lists
{
  def last[T](xs:List[T]): T = xs match {
    case List() =>throw new Error("Empty List")
    case List(x) => x
    case y::ys => last(ys)
  }
  def init[T](xs:List[T]): T = xs match {
    case List() => throw new Error("Empty List")
    case List(x) => x
    case y :: ys => init(ys)
  }
  def concat[T](xs:List[T],ys:List[T]) = xs match {
    case List() => ys
    case z::zs => z :: concat(zs,ys)

  }

  //standalone function
  def reverse[T](xs:List[T],ys:List[T]): List[T] = xs match {
    case List() => List()
  //  case y::ys => reverse(ys) ++ List(y)

  }
  def removeAt[T](xs:List[T],n:Int) = (xs take n) ::: (xs drop n+1)
  //algorithm to sort lists of ints
  def msort(xs: List[Int]):List[Int] = {
    val n = xs.length/2
    if (n==0) xs
    else {
      def merge(xs:List[Int],ys:List[Int]):List[Int] = (xs,ys) match {
        case (Nil,ys) => ys
        case (xs,Nil)=> xs
        case (x :: xs1, y :: ys1) =>
          if(x<y) x :: merge(xs1,ys)
          else y :: merge(xs,ys1)

      }
      val (fst,snd) = xs splitAt n
      merge(msort(fst),msort(snd))
    }
  }
  //for any list
  def msort[T](xs: List[T])(lt: (T,T) => Boolean):List[T] = {
    val n = xs.length/2
    if (n==0) xs
    else {
      def merge(xs:List[T],ys:List[T]):List[T] = (xs,ys) match {
        case (Nil,ys) => ys
        case (xs,Nil)=> xs
        case (x :: xs1, y :: ys1) =>
          if(lt(x,y)) x :: merge(xs1,ys)
          else y :: merge(xs,ys1)

      }
      val (fst,snd) = xs splitAt n
      merge(msort(fst)(lt),msort(snd)(lt))
    }
  }
  def msort2[T](xs: List[T])(implicit ord: Ordering[T]):List[T] = {
    val n = xs.length/2
    if (n==0) xs
    else {
      def merge(xs:List[T],ys:List[T]):List[T] = (xs,ys) match {
        case (Nil,ys) => ys
        case (xs,Nil)=> xs
        case (x :: xs1, y :: ys1) =>
          if(ord.lt(x,y)) x :: merge(xs1,ys)
          else y :: merge(xs,ys1)

      }
      val (fst,snd) = xs splitAt n
      merge(msort2(fst),msort2(snd))
    }
  }
}