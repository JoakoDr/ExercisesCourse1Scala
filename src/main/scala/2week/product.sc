object product {
  def product(f:Int => Int)(y:Int, x:Int): Int =
    if (y>x) 1
  else f(y) * product(f)(y+1,x)
  product(x => x*x)(3,4)

   def fact(n: Int) = product(x => x)(1, n)
  fact(5)

  def mapReduce(f:Int => Int, combine:(Int,Int) => Int,zero: Int)(a:Int,b:Int): Int =
    if (a > b) zero
  else combine(f(a), mapReduce(f,combine,zero)(a+1,b))

}