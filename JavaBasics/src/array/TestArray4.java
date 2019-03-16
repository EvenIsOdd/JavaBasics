package array;
//Java program to get the class name of array in java
/**
 * In java,an array is an object.For array object a proxy class is created whose name can be obtained by getClass.getName();
 * @author Jo
 *
 */
class TestArray4 {

	public static void main(String[] args) {
		//declaration and initialization of array
		int arr[] = { 4, 4 ,5};
		//getting the class name of java array
		///Class c = arr.getClass();
        //String name = c.getName();
		String name = arr.getClass().getName();
        System.out.println(name);
	}

}
