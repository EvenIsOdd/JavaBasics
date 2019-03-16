package polymorphisms;
/**
 * We are calling the run method by the reference variable of Parent class.Since it refers to the subclass object and subclass method overrides
 * the Parent class method,the subclass is invoked at runtime.
 * 
 * @author Jo
 *Since method invocation is determined by the JVM not compiler,it is known as runtime polymorphism
 *JLS,Java Language Specification,Java compilers
 *JVMS,Java Virtual Machine Specification, Java run time
 */
class Bike{
	void run() {
		System.out.println("running");
	}
}
class Splendor extends Bike{
	void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String[] args) {
		Bike b = new Splendor();//upcasting
		b.run();//running safely with 60km
	}

}
