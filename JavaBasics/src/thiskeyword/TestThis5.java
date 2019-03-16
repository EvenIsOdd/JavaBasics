package thiskeyword;
//this():to invoke current class constructor
/**
 * The this() constructor call can be used to invoke the current class constructor.It is used to reuse the constructor.In other words,
 * it is used for constructor chaining.
 * @author Jo
 *
 */
//Calling default constructor from parameterized constructor
class Z{
	Z(){
		System.out.println("hello Z");
		
	}
	Z(int x){
		this();
		System.out.println(x);
	}
}
class TestThis5 {

	public static void main(String[] args) {
		Z z = new Z(10);
		//hello Z
		//10

	}

}
