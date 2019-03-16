package array;
/**
 * Java Array
 * @author Jo
 * Normally,an array is a collection of similar type of elements that have a contiguous memory location.
 * Java array is an object which contains elements of a similar data type.It is a data structure where we store similar elements.
 * We can store only a fixed set of elements in a Java array.
 * Array in java is index-based,the first element of the array is stored at the 0 index.
 *Disadvantages
 *Size limit:We can store only the fixed size of elements in the array.It doesn't grow its size at runtime.To solve this problem,collection framework is used
 *in Java which grows automatically.
 */
class TestArray {

	public static void main(String[] args) {
		String [] arr ;
		arr= new String[2];
		String[]arr04=new String[5];
		TestArray[]arr01;
		int a[]= {1,2,3,4,5};
		int []b= {11,12,13,14,15};
		int[]c= {21,22,23,24,25};
		Object arr02[];
		Class[]arr03;
		int d [] = new int [5] ;
		for(int i =0 ;i<a.length;i++) {
			a[i] = i;
			System.out.println(a[i]);
		}

	}

}
