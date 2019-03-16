package variables;

class Student {
	int id;
	String name;
	final String PAN_CARD_NUMBER;
	//Student(String s){
	//	PAN_CARD_NUMBER=s;
	//}
	//static {
	//	PAN_CARD_NUMBER="1";
	//}
//Note:A final variable that is not initialized at the time of declaration is known as blank final variable.
	//It can be initialized only in constructor.
	public static void main(String[]args) {
		PAN_CARD_NUMBER="1";
	}
}
