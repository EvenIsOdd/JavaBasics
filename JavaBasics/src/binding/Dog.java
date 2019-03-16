package binding;

class Dog {
	private void eat() {
		System.out.println("dog is eating...");
	}
}
class BabyDog extends Dog{
	

	public static void main(String[] args) {
		Dog d1 = new Dog();
		
		Dog d2 = new BabyDog();
		

	}

}
