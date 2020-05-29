object assignment3 extends App{
  
  //Question number 1
  def gcd(a:Int,b:Int):Int=b match{
    case 0 => a
    case x if x>a => gcd(b,a)
    case x => gcd(x,a%x)
  }

  def prime(n:Int,d:Int=2):Boolean= d match{
    case x if(x==n) => true
    case x if gcd(n,x)>1 => false
    case x => prime(n,x+1)
  }
  print("\nEnter an integer to check whether it is a prime : ")
  val p:Int = scala.io.StdIn.readInt()
  println(prime(p))


  //Question number 2
  def primeSeq(n:Int):Any={
    if(n>1){
      primeSeq(n-1);
      if(prime(n)){
        println(n);
      }
    }
  }
  print("\nEnter an Integer as a limit to print sequence of prime numbers : ")
  val ps:Int = scala.io.StdIn.readInt()
  primeSeq(ps);


  //Question number 3
  def sum(n:Int):Int= n match{
    case 0 => 0
    case _ => n+sum(n-1)
  }
  print("\nEnter an integer to add all the integers from 1 : ")
  val sm:Int = scala.io.StdIn.readInt()
  println(sum(sm))
  

  //Question number 4
  def isEven(n:Int):Boolean = n match{
    case 0 => true
    case _ => isOdd(n-1)
  }
  
  def isOdd(n:Int):Boolean = !(isEven(n))
  print("Enter an integer which need to be determine is it even : ")
  val e:Int = scala.io.StdIn.readInt()
  println(isEven(e))
  print("\nEnter an integer which need to be determine is it odd : ")
  val o:Int = scala.io.StdIn.readInt()
  println(isOdd(o))


  //Question number 5
  def addEvens(n:Int):Int = n match{
    case 0 => 0
    case x if(isEven(x)) => n+addEvens(n-1)
    case _ => addEvens(n-1)
  }
  print("\nEnter an Integer to get the addition of all even numbers less than it : ")
  val ae:Int = scala.io.StdIn.readInt()
  print(addEvens(ae))


  //Question number 6
  def fib(n:Int):Int = n match{
    case 0 => 0
    case 1 => 1
    case _ => fib(n-1)+fib(n-2)
  }

  def fibSeq(n:Int):Any = {
    if(n>0){
      fibSeq(n-1);
    }
    print(" "+ fib(n) +" ");
  }
  print("\nEnter an Integer as a limit to print sequence of fibonacci numbers : ")
  val fibs:Int = scala.io.StdIn.readInt()
  fibSeq(fibs);
     
}

