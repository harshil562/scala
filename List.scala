//Concept : How to we define List and how do we iterate over it using for 
//or forEach

object main {
	def main(args: Array[String]): Unit = {
		var a = List(12,13,14)

		//Adding Elements to an existing element
		var b = 15 :: 17 :: a 
		/*for (t <- a){
			println(t)
		}*/
		/*a.foreach{
			println
		}*/
		// You can access this variable by underscore (Very Important)
		b.foreach{
			println(_)
		}	
	}
}