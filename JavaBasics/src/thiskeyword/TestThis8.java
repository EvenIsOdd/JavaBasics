package thiskeyword;
class LiuYan{
	int age;
	String name,address;
	float salary;
	LiuYan(int age,String name,String address){
		this.age=age;
		this.name=name;
		this.address=address;
	}
	LiuYan(int age,String name,String address,float salary){
		this.salary=salary;
		this(age,name,address);//Compile Time Error,Constructor call must be the first statement in a constructor
	}
	void display() {
		System.out.println(age + "" + name + " " + address + " " + salary );
	}
}
class TestThis8 {

	public static void main(String[] args) {
	     
	}

}
