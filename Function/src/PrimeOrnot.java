import java.util.*;
public class PrimeOrnot {
	public static void IsPrime(int a)
	{
		int i,c=0;
		for(i=1; i<=a; i++)
		{
			if(a%i==0)
			{
				++c;
				
			}
		}
		if(c==2)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}
public static void main(String[] args)
{
	int n;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	IsPrime(n);
	
}
}
