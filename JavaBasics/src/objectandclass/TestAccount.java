package objectandclass;
class Account{
	int acc_no;
	String name;
	float amount;
	void insert(int acc_no,String name,float amount) {
		this.acc_no=acc_no;
		this.name=name;
		this.amount=amount;
	}
	void deposit(float amt) {
		amount = amount + amt ;
		System.out.println(amt + "deposited" ) ; 
		
	}
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("Insufficient Balance" );
		}else {
			amount = amount -amt;
			System.out.println(amt + "withdrawn") ;
		}
	}
	 void checkBalance() {
		 System.out.println("Balance is :" + amount);
		 
	 }
	 void display() {
		 System.out.println(acc_no + " "+name+  " "+ amount );
	 }
}
class TestAccount {

	public static void main(String[] args) {
		Account a1 = new Account() ;
		a1.insert(1110200403,"丁春根", 50);
		a1.display();//1110200403 丁春根 50.0
		a1.checkBalance();//Balance is : 50.0
		a1.deposit(400);//400.0 deposited
		a1.checkBalance();//Balance is : 450.0
		a1.withdraw(100);//100.0 withdrawn
		a1.checkBalance();//Balance is : 350.0
		

	}

}
