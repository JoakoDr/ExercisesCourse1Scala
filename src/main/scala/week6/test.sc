
object test{

  val xs = Array(1,2,3,44)
  xs map (x => x*2)
  val r:Range = 1 until 5
  val w:Range = 1 to 12 by 3
}

val s = "Hello World"
s filter (c => c.isUpper)
s exists (c => c.isUpper)
//para todos
s forall  (c => c.isUpper)
//List int char with elemnts of s, like a hashmap
val pairs = List(1,2,3) zip s
//To different Lists
pairs.unzip
s.sum
s.max
