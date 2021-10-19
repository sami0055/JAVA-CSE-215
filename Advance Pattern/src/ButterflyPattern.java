import java.util.*;
public class ButterflyPattern {

	public static void main(String[] args) {
		int i,j,n;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=input.nextInt();
		//Upper half
		for(i=1; i<=n; i++)
		{    
			//first part
			for(j=1; j<=i; j++)
				System.out.print("*");
			//spaces
			for(j=1; j<=2*(n-i); j++)
					System.out.print(" ");
			//Second part
			for(j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
			   
		}
		//Lower Half
		for(i=n; i>=1; i--)
		{ 
			for(j=1; j<=i; j++)
				System.out.print("*");
			for(j=1; j<=2*(n-i); j++)
				System.out.print(" ");
			for(j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
			
		}
		
	}

}
