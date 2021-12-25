package BankAccount;

public class SavingAccount extends Account{

	public SavingAccount(String accno, String name, String address, String phone, String dob) {
		super(accno, name, address, phone, dob);
	
	}
	
	public void deposite(long amt) {
		balance=balance+amt;
	}
	public void withdraw(long amt) {
		balance-=amt;
	}
	
	

}
