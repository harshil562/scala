//Here companion class is able to access data of companion object

object companion {
	private var check:Int = 12
	var o:companion = new companion
	def display() {
		println(o.data)
	}
}

class companion {
	import companion._
	private var data:Int = 5
	def show() {
		println(check)
	}
}	

object main{
	def main(args: Array[String]){
		var newObject:companion = new companion
		newObject.show()
		//How to call name of singleTon Object
		companion.display()
	}
}

//Class defined with the same name as singleTon object is called companion classs and the object becomes
//companion object

// Advantage is that companion pair can access each other's private data.
// You can also use fsc for compilation instead of scalac (Important).

//Now checking whether companion object is able to access private data of companion class

