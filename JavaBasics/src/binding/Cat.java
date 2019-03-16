package binding;
/**
 * In the below example object type cannot be determined by the compiler,because the instance of Cat is also an instance of Animal.So compiler doesn't know
 * its type,only its base type.
 * @author Jo
 *
 */
class Animal{
	void eat() {
		System.out.println("animal is eating...");
	}
}
class Cat extends Animal{
    void eat() {//method overriding
    	System.out.println("cat is eating...");
    }
	public static void main(String[] args) {
		Animal a = new Cat();//reference variable of parent class refers to child class
		a.eat();//cat is eating...
	}

}
