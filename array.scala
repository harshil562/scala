object array {
	def main(args: Array[String]){
		var myArray:Array[Int] = new Array[Int](3)
		for(i <- 0 to 2){
			myArray(i) = i+2;
		}
		// for( i <- 0 to 2){
		// 	println(myArray(i));
		// }
		//We can also do like this
		for(temp <- myArray){
			println(temp)
		}
	}	
}