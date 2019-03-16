package thiskeyword;
//Understanding the problem without this keyword
class Student{
	int rollno;//primitive datatype,4 bytes,32 bits,signed two's complement,-2^31~2^31-1,default value 0 
	String name;//reference datatype,default value null ,immutable
	float fee;//primitive datatype,4 bytes,32 bits,single precision floating point number,default value 0.0f
	Student(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		//rollno=rollno;
		//name=name;
		//fee=fee;
		
	}
	void display() {
		System.out.println(rollno + " " + name + " "+ fee);
	}
}
/**
 * In this example,parameters (formal arguments) and instance variables are same.So,we are using this keyword to distinguish local variable and instance variable.
 * If local variable (formal arguments ) and instance variable are different,there is no need to use this keyword to distinguish local variable and instance variable
 * @author Jo
 *
 */
class TestThis1 {

	public static void main(String[] args) {
		Student s1 = new Student(111,"ankit",5000f);
		Student s2 = new Student(112,"sumit",6000f);
		s1.display();//0 null 0.0
		s2.display();//0 null 0.0

	}

}
