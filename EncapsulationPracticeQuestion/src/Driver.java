import java.util.*;
public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount arr[]=new BankAccount[1];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter your name: ");
			String name=sc.nextLine();
			System.out.println("Enter your accon: ");
			int accno=sc.nextInt();
			System.out.println("Enter your pin: ");
			int key=sc.nextInt();
			System.out.println("Enter your balance: ");
			double balance=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter your address: ");
			String address=sc.nextLine();
			arr[i]=new BankAccount(name,accno,key,balance,address);
			
		}
		
		System.out.println(arr[0].toString());
		
		System.out.println("Ente your key to check balacne: ");
		int key=sc.nextInt();
		System.out.println(arr[0].getBalance(key));
		System.out.println("Withdraw ammount: ");
		double ammount=sc.nextDouble();
	    arr[0].withdraw(ammount);
		System.out.println("Check your balance after withdraw:");
		key=sc.nextInt();
		System.out.println(arr[0].getBalance(key));
		System.out.println("Deposite balance: ");
		ammount=sc.nextDouble();
		arr[0].deposite(ammount);		
		System.out.println("After deposite check bal: ");
		key=sc.nextInt();
		System.out.println(arr[0].checkBalance(key));
		
		
		
	}

}
