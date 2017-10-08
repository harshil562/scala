//Higher Order Function Scala
// When we pass anonymous function as paramater , then it is called higher order Function.
// Question arises , how to we pass type of anonmous function

object main {
	
	def anonymous(f:(Int, Int) => Int) {
		println(f(4,5))
	}

	def main(args: Array[String]): Unit = {
		anonymous((x:Int,y:Int) => x*y)
	}

}