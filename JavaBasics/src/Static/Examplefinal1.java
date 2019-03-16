package Static;

public class Examplefinal1 {

	public static void main(String[] args) {
		final int x =5 ;
		System.out.println("The final value is " + x);//The final value is 5
		B obj = new B ();
		obj.display();//B

	}

}
class C{
	public void display() {
		System.out.println("A");
	}
}
class B extends C{
	@Override
	public void display() {
		System.out.println("B");
	}
}