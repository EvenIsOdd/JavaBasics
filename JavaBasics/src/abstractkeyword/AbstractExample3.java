package abstractkeyword;
//Abstract class containing the constructor
abstract class Vehicle3{
	String msg;
	Vehicle3(String msg){
		this.msg=msg;
	}
	void display() {
		System.out.println(msg);
	}
}
class Honda3 extends Vehicle3{

	Honda3(String msg) {
		super(msg);
		
	}
	
}
public class AbstractExample3 {

	public static void main(String[] args) {
		Honda3 obj=new Honda3("Constructor is invoked");
		obj.display();

	}

}
