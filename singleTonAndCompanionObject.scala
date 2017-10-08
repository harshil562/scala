//Concept of SingleTon and Companion Object

// What is a SingleTon Object is a singly used Class , you cannot instantiate the sinfleTon class , you cannot create
// an object from singleTonObject

object my {
	var check:Int = 5
}

object main {
	def main(args: Array[String]){
		println(my.check);	
	}	
}

// Note is doesn't make sense to extend a singleTon class , because it won't be singleTon anymore.