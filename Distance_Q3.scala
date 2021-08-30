object Distance_Q3 extends App{
  val p1 = Point(1,2)
  val p2 = Point(6,14)
  val p3 = p2.distance(p1)
  
  println(p1)
  println(p2)
  print("Distance : " + p3)
}

case class Point(a:Int, b:Int){
  def x:Int = a
  def y:Int = b

  def distance(that:Point) : Double = {
    val x_Dist : Int = this.x - that.x
    val y_Dist : Int = this.y - that.y
    val dist : Int = (x_Dist*x_Dist + y_Dist*y_Dist)
    math.sqrt(dist)  
 }
  
}