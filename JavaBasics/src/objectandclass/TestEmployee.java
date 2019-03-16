package objectandclass;
/**
 * Initialization through a constructor
 * @param args
 * There are many ways to create an object in Java.They are : 
 * By new keyword
 * By newInstance() method
 * By clone() method
 * By deserialization
 * By factory method etc.
 */
class Employee{
	int id;
	String name;
	float salary;
	Employee(){
		
	}
	void insert(int id ,String name,float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

class TestEmployee {
	
 
	public static void main(String[] args) {
		Employee e1 = new Employee() ; 
		Employee e2 = new Employee() ; 
		Employee e3 = new Employee() ; 
		e1.insert(101, "even", 2000);
		e2.insert(102, "Xu  Shuhui", 2000);
		e3.insert(103, "Liu Yan", 2000);
		e1.display();
		e2.display();
		e3.display();
		
	}

}
