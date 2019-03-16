package abstractkeyword;
abstract class Vehicle1 {//abstract class can contain non-abstract methods,abstract class can have constructors,but cannot be instantiated,abstract class can have 
	//overloaded abstract methods
	abstract void bike();
	void car() {
		System.out.println("Car is running");
	}
	
}
class Honda1 extends Vehicle1 {

	@Override
	void bike() {
		System.out.println("Bike is running");
		
	}
	
}
public class AbstractExample2 {

	public static void main(String[] args) {
		Honda1 obj =new Honda1();
		obj.bike();
		obj.car();
		
	}

}
