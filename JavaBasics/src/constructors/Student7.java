package constructors;

class Student7 {
	int id; //instance variale,primitive datatype,integer ,4 bytes, 32 bits,default value 0,signed two's complement,-2^31~2^31-1(inclusive)
	String name;//instance variable,reference variable,default value null,immutable
	//parameterized constructor with two arguments
	Student7(int i, String n){
		id =i ;
		name =n ;
	}
	//Default constructor
   Student7(){}
   
   /*
    * Access modifiers:
    * private:only within the class
    * default:within the package
    * protected : within the package and subclasses
    * public :everywhere
    * Non-access modifiers:
    *final,static,abstract,synchronized etc.
    */
 //default access level,can be accessed within the package
   void display() {
	   System.out.println(id+" " + name);
   }
   
	public static void main(String[] args) {
		Student7 s1= new Student7(111, "Karan");
		Student7 s2= new Student7();
		s2.id=s1.id;
		s2.name=s1.name;
		s1.display();//111 Karan
		s2.display();//111 Karan

	}

}
