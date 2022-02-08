package QUIZPreparation;

import java.util.Scanner;

public class Task11 {
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
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int count=0;
		for(int i=n1; i<=n2; i++)
		{
			if(isPrime(i))
			{
				count++;
			}
		}
		System.out.println("Between "+n1+" to "+n2+" prime numbers "+count);
		

	}

}
