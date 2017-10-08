//MultiDimensional Array in Scala

object multiDimension {
	def main(args: Array[String]){
		// Single Dimensional Array ==> var myArray:Array[String] = new Array[String](5);
		// MultiDimensional Array 

		// var dArray = Array.ofDim[Int](3,4)
		// for( i <- 0 to 3){
		// 	for(j <- 0 to 2){
		// 		dArray(j)(i) = j; 
		// 	}
		// }	
		// for( i <- 0 to 3){
		// 	for(j <- 0 to 2){
		// 		println(dArray(j)(i));
		// 	}
		// }
		// We can also do like this 
		var dArray = Array.ofDim[Int](3,4)
		for(i<- 0 to 3; j <- 0 to 2){
			dArray(j)(i) = j
		}
		for(i<- 0 to 3; j <- 0 to 2){
			println(dArray(j)(i))
		}
	}
}