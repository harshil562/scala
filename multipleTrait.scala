//Note In Implementation we have to define every abstract field , whether it is abstract function or abstarct field
// Abstract field is a field which is not defined(abstract function) nor intialised(abstract field)


trait one {
	var x:Int // This is called abstract field
	var y:Int = 12 //concrete field.
	def show()
}

//How to use multiple trait in a single Class??

trait two {
	def fun()
}

trait four {
	def more()
}

class three extends one with two with four {
	var x = 12

	def show(){
		println("Show called")
	}
	
	def fun(){
		println("Fun called")
	}

	def more(){
		println("more called")
	}
}

object main {
	def main(args: Array[String]){
		var t:three = new three
		t.show()
		t.fun()
		t.more()
	}
}


