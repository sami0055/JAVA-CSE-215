import java.util.*;
public class SumOfOdd {
	public static void Sum(int n) {
		int i,sum=0;
		for(i=1; i<=n; i++)
		{
			if(i%2==1)
				sum=sum+i;
		}
		System.out.println(sum);
	}
public static void main(String[] args)
{   
	int n;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	Sum(n);	
	}
	
	
}

