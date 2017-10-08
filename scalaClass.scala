class Student(Name:String, Id:Int) {
	//By default every field of class is public
	var name = Name
	var EmployeeId = Id 
	def show(){
		println("My name is :" +name)
		println("with EmployeeId :" +EmployeeId )
	}
}

object hello {
	def main(args:Array[String])
	{
		var s = new Student("Harshil", 186);
		s.show();
	}
}