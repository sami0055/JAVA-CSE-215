import java.util.*;
public class Power {
	public static void PowerOfnx(int x,int n)
	{
		//System.out.println(Math.pow(x, n));
		int i,pow=1;
		for(i=1; i<=n; i++)
			pow=pow*x;
		System.out.println(pow);
	}
public static void main(String[] args)
{
	int x,n;
	Scanner input=new Scanner(System.in);
	x=input.nextInt();
	n=input.nextInt();
	PowerOfnx(x,n);
	
}
}
