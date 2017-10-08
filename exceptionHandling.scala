//Exception Handling

object main {
	def main(args: Array[String]): Unit = {
		var x:Int = 10
		var y:Int = 0
		try {
			print(x/y)
		}
		catch {
			case ex:ArithmeticException => println("Arithmetic Exception Encountered")
		}		
	}
}