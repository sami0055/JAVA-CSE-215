import java.util.Scanner;

public class Task3 {
	
	
	public static void main(String[] args) {	
		generatePrime(0,100);
		
	}
	public static boolean isPrime(int N) {
		boolean b=true;
		if(N<=1)
			b=false;
		for(int i=2; i<=N/2; i++)
		{
			if(N%i==0)
			b=false;
		}
		return b;
	}
	
	public static void generatePrime(int a,int b)
	{
		for(int i=a; i<=b; i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}

}
