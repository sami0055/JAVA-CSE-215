import java.util.*;
public class Count {
public static void main(String[] args)
{
	int n,i=1,s,zero=0,positive=0,negative=0;
	System.out.println("How many number you wnat to input??");
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	while(i<=n)
	{
		s=input.nextInt();
		if(s<0)
			negative++;
		else if(s>0)
			positive++;
		else if(s==0)
			zero++;
		i++;
	}
	System.out.println("Neg="+negative);
	System.out.println("Positive="+positive);
	System.out.println("zero="+zero);
}
}
