import java.util.*;
public class NumberPyramid {
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
		System.out.print(" "+i);
		System.out.println();
	}
}
}
