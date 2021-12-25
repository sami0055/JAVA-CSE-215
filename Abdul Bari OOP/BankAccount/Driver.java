package BankAccount;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		SavingAccount sa[]= new SavingAccount[1];
		
	
		for(int i=0; i<sa.length; i++) {
			System.out.println("Enter Account Number: ");
			String an=sc.nextLine();
			System.out.println("Enter Name: ");
			String name=sc.nextLine();
			System.out.println("ENter Address: ");
			String ad=sc.nextLine();
			System.out.println("Enter Phone number");
			String ph=sc.nextLine();
			System.out.println("Enter DOB: ");
			String dob=sc.nextLine();
			
			sa[i]=new SavingAccount(an,name,ad,ph,dob);
			System.out.println("Enter Your deposite ammount: ");
            long dp=sc.nextLong();
			sa[i].deposite(dp);
			System.out.println("Enter your withsraw ammount: ");
			long amt=sc.nextLong();
			sa[i].withdraw(amt);
			System.out.println(" Do you want to Check your balance yes (1) or no(0)??");
			int c=sc.nextInt();
			if(c==1) {
				System.out.println(sa[i].getBalance());
			}
			else {
				System.out.println("DO you want to exit?");
			}
		}
		
		
		
		
		
	}

}
