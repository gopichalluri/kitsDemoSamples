package collectionDemo;

public class BankOps implements InterestCal {

	double prin;
	Customer cObj;
	public BankOps(double prin, Customer cObj) {
		super();
		this.prin = prin;
		this.cObj = cObj;
	}
	@Override
	public double homeloanInterestCal() {
		
		return prin*0.1+1000+1000+1000;
	}

	

}
