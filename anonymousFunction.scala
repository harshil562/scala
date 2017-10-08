//Anonymous function
//anonymous function is an object which can be assigned to a variable to invoke it

object main {
	def main(args: Array[String]): Unit = {
		var f = (x:Int) => println(x)
		//f() or 
		f.apply(2:Int)
	}
}