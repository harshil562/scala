// Default argument for a function and that value will be used whenever the method is invoked
// Whenever you want to make one argument default , make sure u make all the arguments default.
object hello{
	def main(args:Array[String]){
		fun("Hi");
	}
	def fun(a:String="Hello", b:String="Proness"){
		println(a+ " " +b);
	} 	
}