package abstractkeyword;
//Inner abstract class
class Vehicle5{
	abstract class Car5{
		abstract void display();
	}
	class Honda5 extends Car5{

		@Override
		void display() {
			System.out.println("inner abstract class is invoked");
		}
		
	}
}
public class AbstractExample5 {

	public static void main(String[] args) {
		Vehicle5 obj=new Vehicle5();
		Vehicle5.Car5 c=obj.new Honda5();
		c.display();

	}

}
