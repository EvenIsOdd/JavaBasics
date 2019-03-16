package mypack;

 class C {
	 protected void msg() {
		 System.out.println("Hello java");
	 }

}
public class Simple extends C{
//	void msg() {//C.T. Error
//		System.out.println("Hello java");
		
//	}
	//Note:If you are overriding any method,overriden method(i.e. declared in subclass) must not be more restrictive
	public static void  main(String[]args) {
		Simple obj=new Simple();
		obj.msg();
	}
}
//Note:The default modifier is more restrictive than protected.That is why there is compile time error.