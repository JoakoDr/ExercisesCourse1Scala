
object exprs {
  def show(e:Expr):String = e match {
    case Number(x) => x.toString
    case Sum(e1, e2) => show(e1) + "+" + show(e2)
  }
  show(Sum(Number(1),Number(44)))
}