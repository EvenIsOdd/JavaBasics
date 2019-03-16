package constructors;

class Student3 {
	
	 int id;//default value 0
	String name;//default value null
	//method to display the value of id and name
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		//creating objects
		Student3 s1=new Student3();
		Student3 s2=new Student3();
		s1.display();
		s2.display();

	}

}
