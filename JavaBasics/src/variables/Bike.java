package variables;
//without access modifier,default access level,within the package
//private,default,protected,public
class Bike {
	final void run() {
		System.out.println("running");
	}

	
}
class Honda extends Bike{
	void run() {//cannot override the final method from bike  ,Compile Time Error
		System.out.println("running safely with 100kmph");
	}
  public static void main(String[]args) {
	  Honda honda = new Honda();
	  honda.run();
  }
}
