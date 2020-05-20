object assignment1 extends App{
  
  def convert(celsius:Double)=celsius*1.8+32;
  println("\n35 degrees of celsius is "+convert(35)+" in fahrenheit.");

  def volume(r:Double)=4/3*math.Pi*r*r*r;
  println("\nVolume of a sphere with radius 5 is : "+volume(5));

  def shippingCost(numberOfCopies:Int):Double={
    if(numberOfCopies>50){
      50*3+(numberOfCopies-50)*0.75;
    }else{
      numberOfCopies*3;
    }
  }

  def purchaseCost(coverPrice:Double,numberOfCopies:Int)=coverPrice*numberOfCopies*60/100;

  def totalCost(coverPrice:Double,numberOfCopies:Int)=purchaseCost(coverPrice,numberOfCopies)+shippingCost(numberOfCopies);

  println("\nTotal cost for 60 copies is : Rs"+totalCost(24.95,60) );

}
