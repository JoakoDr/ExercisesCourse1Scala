package week6
import scala.io.Source

object Traductor {
  val in = Source.fromFile("C://Users//j.diaz.ramirez//Desktop//words.txt")
  val words = in.getLines().toList filter (word => word forall(chr => chr.isLetter))

  val nmem = Map(
    '2' -> "ABC", '3'-> "DEF", '4' -> "GHI", '5' -> "JKL",
    '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV", '9' -> "WXYZ"
  )
  //Get the value of every letter A -> 2
  val charCode: Map[Char,Char] =
    for ((digit,str) <- nmem; ltr <- str) yield ltr -> digit

  //By paramater get a string and convert it into a number
  def wordCode(s: String): String =
    s.toUpperCase map charCode

  val wordsForNum : Map[String,Seq[String]] =
    words groupBy wordCode withDefaultValue Seq()

  override def toString: String = "{" + words + "}"

  def encode(num:String):Set[List[String]] =
    if (num.isEmpty) Set(List())
    else {
      for {
        split <- 1 to num.length
        words <- wordsForNum(num take split)
        rest <- encode(num drop split)
      } yield words :: rest
    }.toSet

   def translate(number:String):Set[String] =
    encode(number) map (_ mkString "")

  def main(args: Array[String]): Unit = {
      println(words)
      println(charCode)
      println(wordCode("Java"))
      println(wordsForNum)
    encode("7225247386")
  }
}
