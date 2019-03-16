package constructors;
//Java program to create and call a default constructor
/**
 * Like methods,you can give access specifiers to constructors,but unlike methods,constructors with public ,protected or package access
 * are not inherited by subclasses.(Also ,instead of determining the ability to invoke a method,the access level of a constructor determines
 * the ability to instantiate an object.
 * @author Jo
 *You cannot call this() from methods,only from constructors.If you do call this() in a constructor,you must call it first,before any other code 
 *in the constructor,and you can only call it once.Any code you include after the call to this() will be executed after the invoked constructor 
 *completes.
 *The compiler gives default constructors the same access level as their class.
 */
 class Bike1 {
	 //creating a default constructor
	 Bike1(){
		 System.out.println("Bike is created");
	 }
  //main method
	public static void main(String[] args) {
		
//calling a default constructor
		Bike1 b=new Bike1();
	}

}
//Rule:If there is no constructor in a class, compiler automatically creates a default constructor
 //The default constructor is used to provide the default values to the object like 0,null,etc.,depending on the type.
 