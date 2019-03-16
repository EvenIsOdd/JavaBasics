package Static;

public class Examplestaticblock {
   
	public static void main(String[] args) {
		
        System.out.println("Hello world from main method");
        //Hello world from static block
        //Hello world from main method
	}
	 static {
	    	System.out.println("Hello world from static block");
	    }
/*
 * The above program contains the static block and the main method.The static block is called when the class is loaded.Therefore,the statement in 
 * the static block executes before the statement in the main block.If there are many static blocks,they will execute in sequence.
 */
}
