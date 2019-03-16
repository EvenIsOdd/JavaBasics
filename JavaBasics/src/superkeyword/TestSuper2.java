package superkeyword;
class Mammal{
	void eat() {
		System.out.println("eating...");
	}
}
class Horse extends Mammal{
	void eat() {
		System.out.println("eating grass...");
		
	}
	void run() {System.out.println("running...");}
	void work() {
		super.eat();
		run();
	}
}
/**
 * In the example Mammal and Horse both classes have eat() method if we call eat() method from Horse class,it will call the eat() method of Horse class by default because
 * priority is given to local.
 * To call the parent class method,we need to use super keyword.
 * @author Jo
 *
 */
class TestSuper2 {

	public static void main(String[] args) {
		Horse d = new Horse();
	      d.work();//eating ...
	               //running...

 
	}

}
