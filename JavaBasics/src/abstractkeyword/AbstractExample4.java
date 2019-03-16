package abstractkeyword;
//Abstract class containing overloaded abstract methods
abstract class Vehicle4{
	abstract void display();
	abstract void display(String msg);
}
class Honda4 extends Vehicle4{

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("abstract method is invoked");
	}

	@Override
	void display(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
		
	}
	
}
public class AbstractExample4 {

	public static void main(String[] args) {
		Honda4 obj=new Honda4();
		obj.display();
		obj.display("overloaded abstract method is invoked");

	}

}
