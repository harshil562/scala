//Names arguments allow programmers to change the order of arguments it si completely optional.

object hello{
	def main(args: Array[String]){
		fun(lName="GARG", fName="HARSHIL")
	}

	def fun(fName:String, lName:String){
		println(fName+ " " +lName)
	}
}