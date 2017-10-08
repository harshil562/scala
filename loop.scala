//While, do-while, for loop

object hello{
	def main(args: Array[String]){
		var i:Int = 1
		while(i<=5){
			println(i)
			i=i+1
		}
		do{
			println(i)
			i=i-1
		}while(i>=1)
	}
}

object forLoop{
	def main(args: Array[String]){
		for( i <- 1 to 10){
			//This create val i:Int =1 , val i:Int =2 like this, <- this symbol is called iterator.
			println(i)
		}
	}
}