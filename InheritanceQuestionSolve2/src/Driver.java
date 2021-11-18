import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many parttimeemployee and fulltime employee:");
		int N=sc.nextInt();
		sc.nextLine();
		PartTimeEmployee arr[]=new PartTimeEmployee[N];
		FullTimeEmployee arr2[]=new FullTimeEmployee[N];
		System.out.println("Enter the information for parttime employee: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println("Ente the name of Emplyee: ");
		    String name=sc.nextLine();
		    System.out.println("Enter the age of Employee: ");
		    int age=sc.nextInt();
		     sc.nextLine();
		     System.out.println("Enter the Address of employee: ");
		     String address=sc.nextLine();
		     System.out.println("Enter the Department: ");
		     String dept=sc.nextLine();
		     System.out.println("Enter the desigenation: ");
		     String desi=sc.nextLine();
		     System.out.println("How many hours employee's works time?");
		     double hours=sc.nextInt();
		     System.out.println("Enter the rate of salary per hour: ");
		     double rate=sc.nextInt();
		     arr[i]=new PartTimeEmployee(name,age,address,dept,desi,hours,rate);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println("Salary is : "+arr[i].salary());
		}
		sc.nextLine();
		
		System.out.println("Enter the information for fulltime employee: ");
		for(int i=0; i<arr2.length; i++) {
			System.out.println("Ente the name of Emplyee: ");
		    String name=sc.nextLine();
		    System.out.println("Enter the age of Employee: ");
		    int age=sc.nextInt();
		     sc.nextLine();
		     System.out.println("Enter the Address of employee: ");
		     String address=sc.nextLine();
		     System.out.println("Enter the Department: ");
		     String dept=sc.nextLine();
		     System.out.println("Enter the desigenation: ");
		     String desi=sc.nextLine();
		     System.out.println("Enter the basic salary: ");
		     double basic=sc.nextInt();
		     System.out.println("Enter the allowance: ");
		     double allowance=sc.nextInt();
		     arr2[i]=new FullTimeEmployee(name,age,address,dept,desi,basic,allowance);
		}
		for(int i=0; i<arr2.length; i++) {
			System.out.println("Salary is : "+arr2[i].salary());
		}
			

	}

}
