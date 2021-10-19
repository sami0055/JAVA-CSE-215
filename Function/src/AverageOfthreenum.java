import java.util.*;
public class AverageOfthreenum {
	public static void Average(int a,int b,int c)
	{
		double avg;
		avg=(a+b+c)/3.0;
		System.out.printf("%.2f",avg);
	}
public static void main(String[] args)
{
	int a,b,c;
	Scanner input=new Scanner(System.in);
	a=input.nextInt();
	b=input.nextInt();
	c=input.nextInt();
	Average(a,b,c);
	
}
}
