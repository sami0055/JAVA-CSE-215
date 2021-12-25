package BankAccount;

public class LoanAccount extends Account{

	public LoanAccount(String accno, String name, String address, String phone, String dob) {
		super(accno, name, address, phone, dob);
		
	}
	public void payEMI(long amt) {
		balance-=amt;
	}
	public void replay(long amt) {
		if(balance==amt)
			balance=0;
	}

}
