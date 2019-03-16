package inheritance;
//Hierarchical Inheritance 
class Cat extends Animal{
	void memow() {
		System.out.println("meowing...");
	}
}
class TestInheritance3 {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.memow();//meowing...
		c.eat();//eating...

	}

}
