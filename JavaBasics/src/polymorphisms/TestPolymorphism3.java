package polymorphisms;
class Animal{
	void eat() {
		System.out.println("eating...");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("eating bread...");
	}
}
class Cat extends Animal{
	void eat() {
		System.out.println("eating rat...");
	}
}
class Lion extends Animal{
	void eat() {
		System.out.println("eating meat...");
	}
}
class TestPolymorphism3 {

	public static void main(String[] args) {
		Animal a;
		a = new Dog();//Reference variale of Parent class refers to a Child class,upcasting
		a.eat();//eating bread...
		a = new Cat();
		a.eat();//eating rat...
		a = new Lion();
		a.eat();//eating meat...
	}

}
