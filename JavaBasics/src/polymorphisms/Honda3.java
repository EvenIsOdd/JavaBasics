package polymorphisms;
/**
 * A method is overriden , not the data members,so runtime polymorphism can't be achieved by data members.
 * @author Jo
 *Runtime polymorphism can't be achieved by data members
 *In the example given below,both the classes have a data member speedlimit.We are accessing the data member by the reference variable of Parent class which 
 *refers to the subclass object.Since we are accessing the data member which is not overriden,hence it will access the data member of the Parent class always.
 */
class Toyota{
	Toyota(){
		System.out.println("Is the constructor of parent class invoked");
	}
	int speedlimit=90;//instance variable,member variable ,primitive datatype, 4 bytes, 32 bits,default value 0,signed two's complement,-2^31~2^31-1(inclusive)
}
class Honda3 extends Toyota{
	Honda3(){
		System.out.println(super.speedlimit);
		System.out.println("Is the constructor of child class invoked");
		
	}
   int speedlimit = 150;
	public static void main(String[] args) {
		Toyota obj = new Honda3();//Reference variable of parent class refers to a child class ,upcasting
        System.out.println(obj.speedlimit);//90
	}

}
