import java.util.*;
public class Factorial {
	public static void CalculateFactorial(int a)
	{   
		if(a<0)
		{
			System.out.println("Invalid input");
			return;
		}
		int i,fact=1;
		for(i=a; i>=1; i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
public static void main(String[] args)
{
   int a;
   Scanner input=new Scanner(System.in);
   a=input.nextInt();
   CalculateFactorial(a);
   
   
}
}
