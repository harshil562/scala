// Diamond Problem Solution in Scala
trait one {
	def show(){
		println("one Function called")
	}
}

trait two extends one {
	override def show(){
		println("Two function called")
	}	
}	

trait three extends one {
	override def show(){
		println("Three function called")
	}
}

class four extends two with Three

object main {
	def main(args: Array[String]): Unit = {
		var o:four = new four
		o.show() 
	}
}

//In this case the question arises which show function will be called , obviously last extended class function
//will be called