package polymorphisms;
//Java Runtime Polymorphism with Multilevel Inheritance
class BabyDog extends Dog{
	//void eat() {
		//System.out.println("drinking milk");
	//}
   //class BabyDog extends Dog,but not override the eat method of Dog class,in the Dog class,it overrides the eat method in parent class Animal
	/**
	 * Since,BabyDog is not overriding the eat() method,so eat() method of Dog class is invoked.
	 * @param args
	 */
	public static void main(String[] args) {
		Animal a1,a2,a3;
		Animal a = new BabyDog();
		a.eat();//eating bread...
		a1 = new Animal();
		a2 = new Dog();//Reference variable of parent class refers to child class,upcasting
		a3 = new BabyDog();
		a1.eat();//eating...
		a2.eat();//eating bread...
		a3.eat();//drinking milk
	}

}
