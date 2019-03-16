package constructors;
//Java program to overload constructors in java
class Student5 {
	int id;//instance variable ,default value 0
	String name;//instance variable ,default value null
	int age;//instance variable ,default value 0
	//creating two arg constructor
	Student5 (int i ,String n){
		id=i;
		name=n;
		
	}
	//creating three arg constructor
	Student5 (int i , String n, int a){
		id = i;
		 name = n;
		 age =a;
	}
	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String[] args) {
		Student5 s1 = new Student5(111,"Karan");
		Student5 s2 = new Student5 ( 222, " Aryan ", 25);
		s1.display();//111 Karan 0
		s2.display();//222 Aryan 25

	}

}
