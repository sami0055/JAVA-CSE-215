package BankAccount;

public class Driver {

	public static void main(String[] args) {
		
		Account ac=new Account(21212,50000);
		System.out.println("After creation balance: "+ac.getBalance());
		
		ac.setAnnualInterestRate(4.5);
		
		System.out.println("After withdraw 2500");
		ac.withDraw(2500);
		System.out.println((ac.getBalance()));
		ac.deposite(5000);
		System.out.println("After deposite bal: ");
		System.out.println((ac.getBalance()));
		
		System.out.println("Monthly intereste:"+ac.getMonthlyIntereste());
		System.out.println("The account was created at: "+ac.getDate());
		System.out.println(ac.getMonthlyInteresteRate());

			
		
	}

}

