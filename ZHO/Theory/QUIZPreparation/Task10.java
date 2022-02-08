package QUIZPreparation;
/*
 * 
 * Write a program that contains the a function checkPrime() which takes an integer 
as parameter and prints whether the parameter is prime or not 
 * 
 */
import java.util.Scanner;

public class Task10 {
   
	static void checkPrime(int n) {
		boolean t=true;
		if(n<=1)
			t=false;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
				t=false;		
	       }
		if(t)
			System.out.println("Prime number");
		else
			System.out.println("Not prime number");
	}
	public static void main(String[] args) {
	
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     checkPrime(n);

	}

}
