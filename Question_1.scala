

object Question_1 
{
  def main(args: Array[String]): Unit = 
  {
      var amount: Float = 1425462.05f

      println("Interest amount in a year: " + interest(amount) + "rs")
  }
    def interest(x: Float) : Float = 
    {
      if(x < 20000)
      {
        return (x * 0.02f)
      }
      else if(x < 200000)
      {
        return (x * 0.04f)
      }
      else if(x < 2000000)
      {
        return (x * 0.035f)
      }
      else
      {
        return (x * 0.065f)
      }
    }
}