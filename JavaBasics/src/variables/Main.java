package variables;
//Instance variables
public class Main {
	

	public static void main(String[] args) {
		Product prod1=new Product();
		prod1.setBarcode(123456);
		Product prod2=new Product();
		prod2.setBarcode(987654);
		System.out.println(prod1.Barcode);//987654
		System.out.println(prod2.Barcode);//987654

	}

}
