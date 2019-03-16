package instanceofkeyword;

class Dog extends Animal {
      static void method(Animal a) {
    	  Dog d = (Dog)a;//downcasting
    	  System.out.println("ok downcasting performed");
      }
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog.method(a);//Compile successfully,ClassCastException is thrown at run time
	}

}
