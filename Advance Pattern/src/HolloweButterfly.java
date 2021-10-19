import java.util.*;
public class HolloweButterfly {

	public static void main(String[] args) {
	int i,j,n;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=i; j++)
		{
			if(j==1 || i+j==2*i)
				System.out.print("*");
			else
				System.out.print(" ");
		}
			
		for(j=1; j<=2*(n-i); j++)
			System.out.print(" ");
		for(j=1; j<=i; j++)
		{
			if(j==1|| i+j==2*i)
				System.out.print("*");
			else
				System.out.print(" ");
		}
			
		System.out.println();
		
	}
	for(i=n; i>=1; i--)
	{
		for(j=1; j<=i; j++)
		{
			if(j==1 || i+j==2*i)
				System.out.print("*");
			else
				System.out.print(" ");
		}
			
		for(j=1; j<=2*(n-i); j++)
			System.out.print(" ");
		for(j=1; j<=i; j++)
		{
			if(j==1|| i+j==2*i)
				System.out.print("*");
			else
				System.out.print(" ");
		}
			
		System.out.println();
		
	}

	}

}
