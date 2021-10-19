import java.util.*;
public class GreaterNumber {
	public static int Greater(int a,int b)
	{
		if(a>b)
			return a;
		else 
			return b;
		
	}
public static void main(String[] args)
{
	int a,b;
	Scanner input=new Scanner(System.in);
	a=input.nextInt();
	b=input.nextInt();
	int n=Greater(a,b);
	System.out.println("Greater number is "+n);
}
}
