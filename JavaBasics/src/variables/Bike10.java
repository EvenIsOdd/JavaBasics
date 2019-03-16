package variables;

class Bike10 {
	final int speedlimit;//blank final variable ,it can be initialized only in constructor,primitve datatype,signed two's complement,4bytes,32 bits,-2^31
     Bike10(){
    	 speedlimit=70;
    	 System.out.println(speedlimit);//70
     }
	public static void main(String[] args) {
		new Bike10();
	}

}
