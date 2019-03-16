package Static;

public class ExampleStaticmethod {

	public static void main(String[] args) {
		System.out.println(A.number);
		A.display();
		//output:10
		//A

	}

}
class A{
	static int number=10;
	public static void display() {
		System.out.println("A");//A
	}
}