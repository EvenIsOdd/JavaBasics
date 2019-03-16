package objectandclass;
/**
 * Initialization through method
 * @author Jo
 *In this example,we are creating the two objects of Student class and initializing the value to these objects by invoking the insertRecord method.
 *Here,we are displaying the state(data) of the objects by invoking the displayInformation() method.
 *Object gets the memory in heap memory area.The reference variable refers to the object allocated in heap memory area.
 */
class Even{
	int age;
	String name;
	void insertRecord(int age,String name) {
		this.age=age;
		this.name=name;
	}
	void displayInformation() {
		System.out.println(age+ " " + name);
	}
}
class TestStudent4 {

	public static void main(String[] args) {
	Even e1 = new Even();
	Even e2 = new Even();
	e1.insertRecord(111,"Karan");
	e2.insertRecord(222, "Aryan");
	e1.displayInformation();//111 Karan
	e2.displayInformation();//222 Aryan
	}

}
