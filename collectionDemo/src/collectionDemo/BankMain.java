package collectionDemo;

public class BankMain {

	public static void main(String[] args) {
		Customer cobj=new Customer(121, "Gopi", 10000.0d);
		BankOps bpObj=new BankOps(100000, cobj);
		
		System.out.println(bpObj.homeloanInterestCal());

	}

}
