object pair {

}
val n = 7
def isPrime(n: Int): Boolean = (2 until n) forall(n % _ !=0)
(1 until n) flatMap (i =>
  (1 until i) map (j => (i,j))) filter (pair => isPrime(pair._1+ pair._2))
case class Person (name: String, age: Int)
val persons = Array(new Person("Joaquin",23),
  new Person("Joaquin2",22),
  new Person("Lucia",21),
  new Person("Sebas",17))
persons filter (p => p.age > 21) map (p => p.name)
//for version filtered
for (p <- persons if p.age >21) yield p.name
for {
  i <- 1 until n
  j <- 1 until i
  if isPrime(i+j)
} yield (i,j)

def scalarProduct(xs: List[Double], ys: List[Double]): Double = (for ((x,y) <- xs zip ys) yield x*y).sum