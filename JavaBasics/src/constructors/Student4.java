package constructors;
//Java Program to demonstrate the use of parameterized constructor
class Student4 {
	int id;//instance variable ,default value 0
	String name;//instance variable ,default value null
	//creating a parameterized constructor
	Student4(int i,String n){
		id =i;
		name = n ;
	}
	//method to display the values
    void display() {
    	System.out.println(id + " " + name);
    }
	public static void main(String[] args) {
		//creating objects and passing values
		Student4 s1 = new Student4( 111, "Karan");
		Student4 s2 = new Student4 ( 222, "Aryan");
		//calling methods to display the values of object
		s1.display();//111 Karan
		s2.display();//222 Aryan

	}

}
