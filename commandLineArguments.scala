//Command Line Arguments
// Whatever commands we give while running the program will be the program will be taken by args and simply we are looping
//through the arguments using for loop. 

object commandLine {
	def main(args: Array[String]){
		if(args.length > 1){
			for( arg <- args){
				println(arg);
			}
		}
		else {
			println("Please specify atleast One Argument");
		}
	}
}