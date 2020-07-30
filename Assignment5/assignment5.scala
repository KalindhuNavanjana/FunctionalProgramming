object FunctionsAndData extends App{

  //Question 1
  class Rational(x:Int,y:Int){
    def numer = x
    def denom = y
    
    def neg(){
      new Rational(-numer,denom)
    }
    
    //Question 2
    def sub(r:Rational):Rational={
      new Rational(numer*r.denom - r.numer*denom , denom*r.denom)
    }

    def tostring(){
      println(numer+"/"+denom)
    }
  }

  var x = new Rational(3,4)
  var y = new Rational(5,8)
  var z = new Rational(2,7)

  var result = x.sub(y).sub(z)

  //Question 3
  class Account(id:String,n:Int,b:Double){
    var nic:String=id
    var accnumber:Int=n
    var balance:Double = b
  
    override def toString = "["+ nic +":"+ accnumber +":"+ balance +"]"
    
    def transfer(acc:Account,value:Double){
      this.balance = this.balance-value
      acc.balance = acc.balance+value
    }
  }

  // Question 4
  var bank:List[Account]= List()

  //4.1
  val overdraft = (b:List[Account]) => b.filter(x=>(x.balance<0))

  //4.2
  def add(a:Account,b:Account) : Account =  new Account (a.nic,a.accnumber,a.balance+b.balance)

  val balance = (b:List[Account]) => b.reduce((x,y)=>add(x,y))

  //4.3
  def process(acc:Account) = {
    if(acc.balance>=0){
      acc.balance = acc.balance*1.05
    }else{
      acc.balance = acc.balance*1.1
    }
  }

  val interest = (b:List[Account]) => b.map(process)

}
