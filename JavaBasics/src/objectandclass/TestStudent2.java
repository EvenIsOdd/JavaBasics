package objectandclass;
/**
 * Object and Class Example:Initialization through reference
 * @author Jo
 *Initializing an object means storing data into the object.Initilizing the object through a reference variable.
 */
class Student{
	int id;//primitive datatype,4bytes,32bits,signed two's complement,default value 0,-2^31~2^31-1(inclusive)
	String name;//reference variable,default value null,immutable
}
class TestStudent2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 101;
		s1.name="Sonoo";
		System.out.println(s1.id + " "+ s1.name);//101 Sonoo
	}

}
