object Add_Q1 extends App{
  val p1 = Point(2,3)
  val p2 = Point(4,5)
  
  println(p1)
  println(p2)
  println(p1+p2)
}

case class Point(a:Int, b:Int){
  def x:Int = a
  def y:Int = b

  def +(that:Point) = Point(this.x + that.x, this.y + that.y)
}