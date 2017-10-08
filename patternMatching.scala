object main {
	def main(args: Array[String]): Unit = {
		def matchingPattern(x:Any):Any = {
			x match {
				case 1 => "Check"
				case "Check" => 1
				case _ => "Default Value" 
			}
		}
		println(matchingPattern("Check"))
	}
}