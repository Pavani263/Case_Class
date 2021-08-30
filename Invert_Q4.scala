object Invert_Q4 extends App{
  val p1 = Point(2,3)
  val p2 = Point(4,5)
  val p3 = p1.invert
  val p4 = p2.invert
  
  println(p1)
  println("Invert p1 : " + p3 )
  println(p2)
  println("Invert p2 : " + p4 )
}

case class Point(a:Int, b:Int){
  def x:Int = a
  def y:Int = b

  def invert = Point(this.y,this.x)
    
}