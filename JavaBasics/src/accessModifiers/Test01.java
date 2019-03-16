package accessModifiers;
class A{
	private A () {}//private constructor
	void msg() {
		System.out.println("Hello java");
	}
}

public class Test01 {
      public static void main(String[]args) {
//    	  A obj=new A();//Compile Time Error
    	  //Note:A class cannot be private or protected except nested class
      }
}
