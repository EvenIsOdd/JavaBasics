package superkeyword;
//super is used to invoke parent class constructor
class Even {
	Even(){
		System.out.println("Even is beautiful");
	}
}
class EvenBaby extends Even{
	EvenBaby(){
		super();
		System.out.println("EvenBaby is beautiful,too!");
	}
}
class TestSuper3 {

	public static void main(String[] args) {
		EvenBaby evenBaby= new EvenBaby();
		//Even is beautiful
		//EvenBaby is beautiful ,too!
		/**
		 * Note:super() is added in each class constructor automatically by compiler if there is no super() or this();
		 * As we know well that default constructors provided by compiler automatically if there is no constructor.But,it also adds super() as the first statement.
		 */

	}

}
