import java.util.*;
public class PascalTriangle {
public static void main(String[] args)
{
	int i,j,n,c=1;
	Scanner input=new Scanner(System.in);
    System.out.print("Enter a number: ");
	n=input.nextInt();
	for(i=0; i<n; i++)
	{
		for(j=0; j<(n-i); j++)
			System.out.print(" ");
	
		for(j=0; j<=i; j++)
		{
			if(j==0||i==0)
				c=1;
			else
				c=c*(i-j+1)/j;
			
			System.out.printf("%4d",c);
		}
			
		System.out.println();
	}
	
}
}
