package thiskeyword;
/**
 * this keyword can be used to return current class instance
 * We can return this keyword as an statement from the method.In such case,return type of the method 
 * must be the class type (non-primitive).
 * @author Jo
 *
 */
class D{
	D getD() {
		return this;
	}
	void msg() {
		System.out.println("Hello java");
	}
}
class Test1 {

	public static void main(String[] args) {
		new D().getD().msg();//Hello java

	}

}
