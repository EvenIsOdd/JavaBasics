package loops;
//A Java program to demonstrate the use of labeled for loop
public class LabeledForExample {
/**
 * 1 1
 * 1 2 
 * 1 3
 * 2 1
 * 3 1
 * 3 2 
 * 3 3
 * @param args
 */
	public static void main(String[] args) {
		//Using Label for outer and for loop
		aa:
			for(int i=1;i<=3;i++) {
				bb:
					for(int j=1;j<=3;j++) {
						if(i==2&&j==2) {
							break aa;//If you use break bb;it will break inner loop only which is the default behavior of any loop
						}
						System.out.println(i + " " + j);
					}
			}

	}

}
