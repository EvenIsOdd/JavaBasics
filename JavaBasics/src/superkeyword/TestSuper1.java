package superkeyword;
//super is used to refer immediate parent class instance variable
class Animal{
	String color="white";
	int a =10;
	void display() {
		System.out.println("dispaly method of parent class");
	}
}
class Dog extends Animal {
	String color="black";//子类中的color 变量和父类中的color应该不是一个变量吧，String is immutable
	
	void printColor() {
		/**
		 * In this example,Animal and Dog both classes have a common property color.If we print color property,it will print the color of current class by default.To 
		 * access the parent property,we need to use super keyword.
		 */
		System.out.println(color);//prints color of Dog class
		System.out.println(super.color);//prints color of Animal class
		super.display();
	}
}
public class TestSuper1 {

	public static void main(String[] args) {
		//Animal dog =new Animal();
		//Animal dog = new Dog();
		Dog dog = new Dog();
		System.out.println(dog.color);//black
		System.out.println(dog.a);//10
		dog.printColor();//black
		                 //white
		                 //display method of parent class

	}

}
