object LargestNumber{
    def main(args: Array[String]): Unit={
        println("Enter the first No:")
        var num1=scala.io.StdIn.readInt()

        println("Enter the second No:")
        var num2=scala.io.StdIn.readInt()

        if(num1>num2)
        {
            println("The largest number is"+num1)
        }
        else if(num1<num2)
        {
            println("The largest number is:"+num2)
        }
        else
        {
            println("Both numbers are equal")

        }
    }
}