package array;

class TestArray5 {

	public static void main(String[] args) {
		int [] a [] = {{1,2,3},{3,4,5}};//2 rows ,3 columns
		int [] [] b= { {1, 2 ,3 }, { 3, 4 , 5  }};// 2 rows, 3 columns
		int c[][] = new int [2][3];//2 rows,3 columns
		for (int i =0;i<a.length;i++) {
			for(int j=0 ;j<3;j++) {
				c[i][j]=a[i][j]+ b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
