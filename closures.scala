// Closures are functions whose value retuern value depends on the value defined outside the function
//Block

object main {
	def main(args: Array[String]) = {
		var y:Int = 10
		val f = (x:Int) => y*x
		println(f(10))
	}
}