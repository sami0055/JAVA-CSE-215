import java.util.*;
public class MultipleTable {
	public static void Multiple(int n)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
public static void main(String[] args)
{
	int n;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	Multiple(n);
	
}
}
