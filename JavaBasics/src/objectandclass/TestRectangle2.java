package objectandclass;
/**
 * Creating multiple objects by one type only 
 * @author Jo
 *We can create multiple objects by one type only as we do in case of primitives.
 *Initialization of primitive variables:
 *int a =10 , b =20 ;
 *Initialization of reference varialbes:
 *Rectangle r1 = new Rectangle(),r2 = new Rectangle();//creating two objects
 */
class Rectangle{
	int length;
	int width;
	void insert(int length,int width) {
		this.length=length;
		this.width = width;
	}
	void calculateArea(){
		System.out.println(length*width);
	}
}
class TestRectangle2 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(),r2 = new Rectangle();//creating two objects
		r1.insert(11, 5);
        r2.insert(3, 15);
        r1.calculateArea();//55
        r2.calculateArea();//45
	}

}
