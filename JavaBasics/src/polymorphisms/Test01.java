package polymorphisms;
class A {
	void methodA(){
		System.out.println("Method A invoked");
	}
}
class B extends A {
	void methodA() {
		System.out.println("Method A in the subclass invoked");
		super.methodA();
	}
}
public class Test01 {

	public static void main(String[] args) {
		B b = new B();
		b.methodA();//Method A in the subclass invoked
                    //Method A invoked
	}

}
