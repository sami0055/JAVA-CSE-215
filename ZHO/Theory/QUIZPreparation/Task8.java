package QUIZPreparation;

import java.util.Scanner;

/*
 * 
 * Write a program to find whether a given integer input is prime or not.
 */
public class Task8 {

	static boolean isPrime(int n) {
		boolean t=true;
		if(n<=1)
			t=false;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			t=false;
		}
		return t;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		   for(int i=1; i<=n; i++)
		   {
			   if(isPrime(i))
				{
					System.out.println(i+" is Prime");
				}
				else {
					System.out.println(i+" is not Prime");
				}
		   }
			
		
		
		

	}

}
