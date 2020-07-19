object Cipher extends App{

  def f1(x:Char):Int=x

  def f2(x:Int):Char=x.toChar

  var shift=1

  def encrypt(c:Char):Char=f2(f1(c)+shift)

  def decrypt(c:Char):Char=f2(f1(c)-shift)

  
  print("Enter the text : ")
  val text = scala.io.StdIn.readLine()

  print("Enter the encryption KEY : ")
  shift = scala.io.StdIn.readInt() 
  
  println("\nEncrypted text is :>> "+text.map(encrypt))
  println("\nDecrypted text is :>> "+text.map(decrypt)+"\n\n")


}
