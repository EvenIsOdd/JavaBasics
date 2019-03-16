package inheritance;
//Single Inheritance
class Animal{//the class without access modifier ,default access level,within package
	void eat() {
		System.out.println("eating...");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking...");
	}
}
 class TestInheritance {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();//barking
		d.eat();//eating
	}

}
