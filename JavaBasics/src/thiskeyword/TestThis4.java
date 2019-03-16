package thiskeyword;
//this:to invoke current class method
/**
 * You may invoke the method of the current class by using the this keyword.
 * If you don't use this keyword,compiler automatically adds this keyword while invoking the method.
 * @author Jo
 *
 */
class A {
	void m() {System.out.println("hello m");}
	void n() {
		System.out.println("hello n ");
		this.m();
	}
}
class TestThis4 {

	public static void main(String[] args) {
		A a = new A();
		a.n();
		//hello n
		//hello m
	}

}
