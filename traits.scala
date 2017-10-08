//Traits in Scala , similar to Interface in Java (where we declare all the functions)
// Property of trait is that it cannot be instantiated, we cannot make objects out of it.
//Note abstract class cannot be instantiated.
trait one {
	def show()
}

class two extends one {
  def show() {
  	println("Show function Called")
  }
}

object main {
	def main(args: Array[String]){
		var o:two = new two
		o.show()
	}
}
