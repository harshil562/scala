//Concept: currying functions are functions in which you convert a function into a form which takes only one 
//argument.

//Very simple currying function

object main {
	def main(args: Array[String]): Unit = {
		def currying(x:Int) = (y:Int) => x-y
		println(currying(12)(13))
	}
}