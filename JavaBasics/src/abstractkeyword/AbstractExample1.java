package abstractkeyword;
/**
 * Access Modifiers:public-everywhere,protected-within package and subclasses,default-within package,private-within class
 * Non-Access Modifiers:
 * @author Jo
 *
 */
abstract class Vehicle{
	abstract void bike();
	//abstract void bicycle();
	//abstract void bike(String s);
	final void tricyle() {
		
	}
    void	main(String[]args){
		
	}
}
/** Abstract is a non-access modifier which is used to create abstract class and method.
 * The role of abstract class is to contain abstract methods.However,it may also contain non-abstract methods.The method which is declared
 * with abstract keyword and doesn't have any implementation is known as an abstract method.
 * Note - We cannot declare abstract methods in non abstract class.
 * Rules of abstract keyword
 * Don'ts
 * An abstract keyword cannot be used with variables and constructors
 * If a class is abstract,it cannot be instantiated.
 * If a method is abstract,it doesn't contain the body.
 * We cannot use the abstract with the final
 * We cannot declare abstract methods as static
 * An abstract method can't be synchronized.
 * Do's
 * An abstract keyword can only be used with class and method 
 * An abstract class can contain constructors and static methods
 * If a class extends the abstract class,it must also implements at least one of the abstract method.
 * --貌似抽象类继承抽象可以不实现父类中的任何抽象方法，但也可以实现其中的一些抽象方法
 * An abstract class can contain the main method and the final method.
 * An abstract class can contain overloaded abstract methods.
 * We can declare the local inner class as abstract.
 * We can declare the abstract method with a throw clause.
 * 
 * @author Jo
 *
 */
 class Honda extends Vehicle{

	void bike() {
		System.out.println("Bike is running ");
	}
	
}
public class AbstractExample1 {

	public static void main(String[] args) {
		Honda obj = new Honda();
		obj.bike();

	}

}
