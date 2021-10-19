import java.until.*;
import java.util.Scanner;
public class HalfPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,j;
		n=sc.nextInt();
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
