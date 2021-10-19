import java.util.*;
public class PalindromicPattern {
  public static void main(String[] args)
  {
	  int i,j,n;
	  Scanner input=new Scanner(System.in);
	  n=input.nextInt();
	  for(i=1; i<=n; i++)
	  {
		  for(j=1; j<=(n-i); j++)
		  System.out.print(" ");
		  for(j=i; j>=1; j--)
			  System.out.print(j);
		  for(j=2; j<=i; j++)
			  System.out.print(j);
		  System.out.println();
	  }
  }
}
