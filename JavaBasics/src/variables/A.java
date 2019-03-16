package variables;

class A {
	static final int data;//static blank final variable
	// A () {
	//	data=10;
	//}
	//Note:static blank final variable can be initialized only in static block
	static {
		data=50;
	}

	public static void main(String[] args) {
		System.out.println(A.data);//50

	}

}
