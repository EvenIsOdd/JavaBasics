package accessModifiers;
/**
 * The access modifiers in java specifies accessibility (scope ) of a data member,method,constructor or class.
 * @author Jo
 *
 */
 class PrivateMethod{//the class is default accessed within the package
private	 void privateMethod() {
		System.out.println("the private method is invoked");
	}
}

public class Test02 {
public static void main(String[]args) {
	PrivateMethod privateMethod=new PrivateMethod();
	privateMethod.privateMethod();
}
}
