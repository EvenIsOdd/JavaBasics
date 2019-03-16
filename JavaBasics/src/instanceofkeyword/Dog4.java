package instanceofkeyword;

class Dog4 extends Animal {
   static void method(Animal a) {
	   if(a instanceof Dog4) {
		   //Dog4 d2 = (Dog4) new Animal();
		   Dog4 d = (Dog4)a;//downcasting
		   System.out.println("ok downcasting performed");
	   }
   }
	public static void main(String[] args) {
		Animal a = new Dog4();//upcasting,reference variable of parent class refers to child class
		Dog4.method(a);//ok downcasting performed
	}

}
