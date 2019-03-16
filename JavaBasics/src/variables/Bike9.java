package variables;
//default access level,within the package
class Bike9 {
      final int speedlimit =90; //final varialbe,primitive datatype,4bytes,32bits,default value 0,-2^31~2^31-1(inclusive),signed two's complement
      void run() {
    	  speedlimit=400;//final field cannot be assigned,compile time error
      }
	public static void main(String[] args) {
		Bike9 obj = new Bike9();
		obj.run();
		
	}

}
