package objectandclass;
/**
 * Anonymous object
 * Anonymous simply means nameless.An object which has no reference is known as an anonymous object.It can be used at the time of object creation only.
 * If you have to use an object only once,an anonymous object is a good approach.For example:
 * new Calculation();//anonymous object
 * @author Jo
 *Calling method through a reference
 *Calculation c = new Calculation();
 *c.fact(5);
 *Calling method through an anonymous object
 *new Calculation().fact(5);
 */
class Calculation {
	void fact(int i){
		System.out.println("calling method through an anonymous object");
	}

	public static void main(String[] args) {
		new Calculation().fact(5);//Calling method through anonymous object
		//output:calling method through an anonymous object

	}

}
