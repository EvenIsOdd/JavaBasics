package thiskeyword;
//Program where this keyword is not required
class Classmate{
	int rollno;
	String name;
	float fee;
	Classmate(int r,String n,float f){
		/**
		 * It is better approach to use meaningful names for variables.So we use same name for instance variables and parameters in real time,and always use this keyword.
		 */
		rollno = r;
		name = n;
		fee = f;
	}
	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}
class TestThis2 {

	public static void main(String[] args) {
		Classmate c1 = new Classmate(111,"ankit",5000f);
		Classmate c2 = new Classmate(1110200403,"丁春根",50000f);
		c1.display();//111 ankit 5000.0
		c2.display();//1110200403 丁春根 50000.0

	}

}
