package instanceofkeyword;
/**
 * instanceof in java with a variable that have null value
 * @author Jo
 *If we apply instanceof operator with a variable that have null value,it return false.
 */
class Dog2 {
	String a;
	public static void main(String[]args) {
		Dog2 d2 = new Dog2();
		System.out.println(d2.a instanceof String);//false
	}

}
