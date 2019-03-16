package instanceofkeyword;
/**
 * Downcasting without the use of java instanceof
 * @author Jo
 *Downcasting can also be performed without the use of instanceof operator as displayed in the following example:
 *
 */
class Dog5 extends Animal {
	static void method(Animal a) {
		Dog5 d =(Dog5)a;//downcasting
		System.out.println("ok downcasting performed");
	}

	public static void main(String[] args) {
		Animal a = new Dog5();//reference variable of parent class refers to child class,upcasting
		Dog5.method(a);//ok downcasting performed

	}
/**
 * Actual object that is referred by a ,is an object of Dog class.So if we downcast it ,it is fine.But what will happen if we write:见下个类
 * Animal a = new Animal();
 * Dog.method(a);
 * 
 */
}
