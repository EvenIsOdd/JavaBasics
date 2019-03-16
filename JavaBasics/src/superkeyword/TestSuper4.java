package superkeyword;
class Canine{
	Canine(){
		System.out.println("canine is created");
	}
}
class Wolf extends Canine{
	Wolf(){
		//super();
		System.out.println("Wolf is created");
	}
}
class TestSuper4 {

	public static void main(String[] args) {
		Wolf w = new Wolf();
		//canine is created
		//Wolf is created

	}

}
