import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>9)
		{
			n=sc.nextInt();
		}
		else {
			for(int i=1; i<=n; i++)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(j);
				}
				System.out.println();
			}
		}

	}

}
