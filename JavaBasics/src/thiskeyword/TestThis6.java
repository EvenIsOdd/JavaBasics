package thiskeyword;
//Calling parameterized constructor from default constructor
class Y{
	Y(){
		this(5);
		System.out.println("hello y");
	}
	Y(int x){
		System.out.println(x);
	}
}
class TestThis6 {

	public static void main(String[] args) {
		Y y = new Y ();
		//5
		//hello y
	}

}
