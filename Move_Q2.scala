object Move_Q2 extends App{
  val p1 = Point(2,3)
  val p2 = Point(4,5)
  val p3 = p1.move(3,4)
  val p4 = p2.move(5,6)
  
  println(p1)
  println("Move p1 by 3 and 4 : " + p3)
  println(p2)
  println("Move p2 by 5 and 6 : " + p4)
}

case class Point(a:Int, b:Int){
  def x:Int = a
  def y:Int = b

  def move(dx:Int, dy:Int) = Point(this.x + dx, this.y + dy)
}