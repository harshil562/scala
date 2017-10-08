// How to write multiple constructors in scala programming.

class account(ac_id:Int, name:String, balance:Double){
	//One Constructor is automatically created, initialising the class object with arguments fields
	//In case programmer is not defining balance , how to define constructor for only two arguments
	def this(a:Int, n: String){
		this(a,n,0)
	}
	def this(a:Int){
		this(a, "", 0)
	}
	def this(){
		this(0, "", 0)
	}
	def show(){
		println("Id: " +ac_id)
		println("name: " +name)
		println("balance: " +balance)
	}
}

object hello{
	def main(args:Array[String]){
		var a=new account(1, "Harshil", 2)
		a.show()
		var b=new account(1, "Harshil")
		b.show()
		var c=new account(1)
		c.show()
		var d=new account()
		d.show()
	}
}