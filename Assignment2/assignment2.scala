object assignment2 extends App{
  
  //Question Number 1
  def wage(h:Int):Double=150*h;

  def ot(h:Int):Double=75*h;

  def income(wageH:Int,otH:Int)=wage(wageH)+ot(otH);

  def tax(income:Double)=income*10/100;

  def netIncome(wageH:Int,otH:Int)=income(wageH,otH)-tax(income(wageH,otH));

  println("\nnet income for a person who works for 40 Normal and 20 OT hour per week is : Rs"+netIncome(40,20)+"\n");



  //Question Number 2
  def attendees(price:Int):Int={
    val increment = price-15;
    val difference = (increment/5)*(-20);     //for an increment of 5 attendees decreeses by 20
    120+difference;
  }
  
  def ticketIncome(price:Int)=attendees(price)*price;

  def cost(price:Int)=500+3*attendees(price);

  def NetIncome(price:Int)=ticketIncome(price)-cost(price);
  
  var i=0;
  for(i<- 1 to 10){
    println("profit for the ticket price of "+i*5+" is : Rs"+ NetIncome(i*5));
  }

}
