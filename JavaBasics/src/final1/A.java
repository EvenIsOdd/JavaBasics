package final1;

class A {
     final public void display() {
    	 System.out.println("A");
     }
}
class B extends A {
	public void display() {//Cannot override the final method from A 
		System.out.println("B");
	}
}