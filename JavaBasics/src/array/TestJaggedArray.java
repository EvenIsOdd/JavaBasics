package array;
/**
 * Java program to illustrate the jagged array
 * @author Jo
 *
 */
class TestJaggedArray {

	public static void main(String[] args) {
		int [][]arr= new int [3][];
		int array[][];
		int []array02[];
		int [][] array03;
		arr[0] = new int [3];
		arr[1] = new int [4];
		arr[2] = new int [2];
		//initializing a jagged array
		int count = 0 ;
		for ( int i = 0 ; i < arr.length;i++) {
			for (int j =0 ; j<arr[i].length;j++) {
				arr[i][j]=count++;//先将count的值赋值给数组中的元素，然后再对count自增1
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();//new line
			//0 1 2 
			//3 4 5 6
			//7 8 
		}
	}

}
