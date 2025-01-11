package collectionDemo;

public class Customer {
	int accno;
	String accHolderName;
	double curBal;
	public Customer(int accno, String accHolderName, double curBal) {
		super();
		this.accno = accno;
		this.accHolderName = accHolderName;
		this.curBal = curBal;
	}
	@Override
	public String toString() {
		return "Customer [accno=" + accno + ", accHolderName=" + accHolderName + ", curBal=" + curBal + "]";
	}
	
	
	

}
