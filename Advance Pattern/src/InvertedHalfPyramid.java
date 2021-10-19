import java.util.*;
public class InvertedHalfPyramid {
public static void main(String[] args)
{
	int i,j,n,k=0;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	for(i=n; i>=1; i--)
	{   k++;
	for(j=1; j<=(n-i); j++)
	{
		System.out.print(" ");
	}
		for(j=1; j<=i; j++)
			System.out.print(" "+k);
		System.out.println();
	}
}

}
