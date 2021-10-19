import java.applet.*;
import java.util.Scanner;
public class DiamondPattern {
public static void main(String[] args)
{
	int i,j,n;
	 Scanner input=new Scanner(System.in);
	 n=input.nextInt();
	 for(i=1; i<=n; i++)
	 {
		 for(j=1; j<=(n-i); j++)
			 System.out.print(" ");
		 for(j=1; j<=i; j++)
			 System.out.print("*");
		 for(j=2; j<=i; j++)
		 System.out.print("*");
		 
		 System.out.println();
	 }
	 for(i=n-1; i>=1; i--)
	 {
		 for(j=1; j<=(n-i); j++)
			 System.out.print(" ");
		 for(j=1; j<=i; j++)
			 System.out.print("*");
		 for(j=2; j<=i; j++)
			 System.out.print("*");
		 
		 System.out.println();
		 
	 }
	

}
}
