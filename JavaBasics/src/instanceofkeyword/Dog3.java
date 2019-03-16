package instanceofkeyword;
/**
 * 
 * @author Jo
 *
 */
class Dog3 {

	public static void main(String[] args) {
	Dog3 d = null;
	System.out.println(d instanceof Dog3);//false
     Dog1 d1  = (Dog1)new Animal();
     //Compiles successfully but ClassCastException is thrown at runtime
   System.out.println(d1 instanceof Animal);//true
   System.out.println(d1 instanceof Dog1);//true
	}

}
