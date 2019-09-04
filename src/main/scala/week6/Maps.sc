
object Maps {
  val romanNumerals = Map('I' -> 1, 'V' -> 5, 'X' -> 10)
  val capitalOfCountry = Map("US" -> "Wasignthn", "Spain" -> "Madrid", "Swizerland" -> "Brenn")

  "I".->(1)
}
val romanNumerals = Map('I' -> 1, 'V' -> 5, 'X' -> 10)
val capitalOfCountry = Map("US" -> "Wasignthn", "Spain" -> "Madrid", "Swizerland" -> "Brenn")

"I".->(1)
capitalOfCountry get  "Andorra"
capitalOfCountry get  "US"
//Orderby and Groupby with Scala
val fruit = List("apple","Orange","Pear","PEach")
fruit groupBy (_.head)
fruit sortWith (_.length < _.length)
fruit.sorted