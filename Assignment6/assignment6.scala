object CaseClass extends App{
  
  case class Point(a:Int,b:Int){
    var x = a;
    var y = b;
  
    def +(that:Point):Point={
      Point(this.x+that.x,this.y+that.y);
    }

    def move(dx:Int=0,dy:Int=0)={
      Point(this.x+dx,this.y+dy);
    }

    def distance(p:Point)={
      Math.sqrt(Math.exp(Math.abs(this.x-p.x))+Math.exp(Math.abs(this.y-p.y)));
    }

    def invert()={
      Point(this.y,this.x);
    }
  }


  val a =Point(2,3);
  val b =Point(1,2);
  println("a is : "+a+"\nb is : "+b);
  
  println("a+b : "+ (a+b));

  println("move dx=1 and dy=-1 : "+a.move(1,-1));
  println("move dx=3 : "+a.move(dx=3));
  println("move dy=2 : "+a.move(dy=2));

  println("Distance between a and b : "+a.distance(b));

  println("invert of a : "+a.invert());
  
}
