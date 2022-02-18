import java.util.Scanner;

public class Task1 {

	public static int isPerfact(int N)
	{
		int sum=0;
		for(int i=1; i<N; i++)
		{
			if(N%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==N)
			return 1;
		
			return 0;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=2; i<=n; i++)
	{
		if(isPerfact(i)==1)
		{
			System.out.print(i+" ");
		}
		
	}

	}

}
