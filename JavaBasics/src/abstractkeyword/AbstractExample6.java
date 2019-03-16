package abstractkeyword;
//Nested abstract class
abstract class Vehicle6{
	abstract class Car6{
		abstract void display();
	}
}
class Honda6 extends Vehicle6{
	class FourWheller extends Car6{

		@Override
		void display() {
			System.out.println("nested abstract class is invoked");
			
		}
		
	}
}
public class AbstractExample6 {
	public static void main(String[]args) {
		Vehicle6 obj=new Honda6();
		Honda6 h=(Honda6)obj;
		Honda6.FourWheller fw=h.new FourWheller();
		fw.display();
	}

}
