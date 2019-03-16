package operator;

public class Test07 {
	public static void main(String[]args) {
		int a=15;
		int b =2;
		int x =a&b;
		int y = a | b ;
		int z = a^b;
		System.out.println(a+"&" + b  + "=" +x);//a&b=2
		System.out.println(a+"|" + b  + "=" +y);//a|b=15
		System.out.println(a+"^" + b  + "=" +z);//a^b=13
	}

}
