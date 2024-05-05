object pos_neg{
    def main(args: Array[String]): Unit={
        println("Enter the Number:")
        var num=scala.io.StdIn.readInt()

        if(num==0)
        {
            println("The number is 0")
        }
        else if(num>0)
        {
            println("The number is positive")
        }
        else
        {
            println("The number is negative")
        }
    }
}