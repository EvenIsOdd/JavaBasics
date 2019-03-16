package polymorphisms;
class Bank{
	float getRateOfInterest() {return 0;}//float,primitive datatype,32bits,4bytes,single-precision floating point number ,default value 0.0f,
}
class SBI extends Bank{
	float getRateOfInterest() {
		return 8.4f;
	}
	
}
class ICICI extends Bank{
	float getRateOfInterest() {
		return 7.3f;
	}
}
class AXIS extends Bank{
	float getRateOfInterest() {
		return 9.7f;
	}
}
class TestPolymorphism {

	public static void main(String[] args) {
		Bank b;//Reference variable of parent class
		b= new SBI();//refers to SBI subclass
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());//SBI Rate of Interest: 8.4
		b = new ICICI();
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());//ICICI Rate of Interest: 7.3
		b = new AXIS();
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());//AXIS Rate of Interest: 9.7
	}

}
