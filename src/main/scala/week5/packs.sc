def pack[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: xs1 => val (first,rest) = xs span (y => y == x)
    first :: pack(rest)
}
val data = List("a","a","a","a","b","b","c")
pack(data)=

def encode[T](xs:List[T]): List[List[T,Int]] =
  pack(xs) map (ys => (ys.head,ys.length))