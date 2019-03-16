package inheritance;
class Employee{
	float salary=40000;//float ,primitive datatype,4 bytes,32 bits,single-precision IEEE754 floating point number
}
class Programmer extends Employee{
	int bonus=10000;//int ,primitive datatype,4bytes,32 bits,signed two's complement,

	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Programmer salary is :" +p.salary);
		System.out.println("Bonus of Programmer is : " + p.bonus);

	}

}
