import scala.io.StdIn._

object Question_2 
{
   def main(args: Array[String]): Unit = 
   {

        print("Enter an integer: ")
        var x = readInt();

        x match 
        {
          case x if x <= 0 => println("Negative/Zero is given")

          case x if x%2==0 => println("Even number is given")

          case _ => println("Odd number is given")
       }
    }
}