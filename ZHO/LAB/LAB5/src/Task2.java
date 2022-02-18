import java.util.Scanner;

public class Task2 {

	public static int getSum(int N)
	{
		int temp=N;
		int r;
		int sum=0;
		while(temp!=0)
		{
		   r=temp%10;
		   sum=sum+r;
		   temp=temp/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=getSum(n);
		System.out.println(t);

	}

}
