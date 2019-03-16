package innerclass;

public class Test1 {
	class InnerClass{
		void display() {
			System.out.println("内部类会被编译成不同的class文件吗？");
		}
	}

	public static void main(String[] args) {
		Test1 test1=new Test1();
		InnerClass innerClass=test1.new InnerClass();
		innerClass.display();
		

	}

}
