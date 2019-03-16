package thiskeyword;
/**
 * The this() constructor call should be used to reuse the constructor from the constructor.It maintains the chain between the constructors i.e. it is used for 
 * constructor chaining.
 * @author Jo
 *
 */
class Even{
	int age;
	String name,address;
	float salary;
	Even(int age,String name,String address){
		this.age=age;
		this.name=name;
		this.address=address;
	}
	Even(int age,String name,String address,float salary){
		/**
		 * Rule:Call to this() must be the first statement in constructor
		 */
		this(age,name,address);//reusing constructor
		this.salary=salary;
	}
	void display() {
		System.out.println(age + " " + name + " " + address+ " " + salary);
	}
}
class TestThis7 {

	public static void main(String[] args) {
		Even e1= new Even(18 ,"even" ,"大连新村");
		Even e2 = new Even(20,"Yiwen","天宝西路",50000f);
      e1.display();//18 even 大连新村 0.0
      e2.display();//20 Yiwen 天宝西路 50000.0
	}

}
