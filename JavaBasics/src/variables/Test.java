package variables;

public class Test {
	public void pupAge() {
		int age=0;
		age=age+7;
		System.out.println("Puppy age is : "+ age);//Puppy age is : 7
	}

	public static void main(String[] args) {
		Test test=new Test();
		test.pupAge();
	}

}
