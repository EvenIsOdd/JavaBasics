package array;
//Java program to copy a source array into a destination array in java
class TestArrayCopyDemo {

	public static void main(String[] args) {
		char[] copyFrom = {'a','b'};
		char copyTo[]= new char[1];
		System.arraycopy(copyFrom, 1,copyTo , 0, 1);
		System.out.println(String.valueOf(copyTo));//b

	}

}
