import java.util.*;
public class SumofTwonum {
	public static int calculateSum(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
public static void main(String[] args)
{
  Scanner input=new Scanner(System.in);
  int a,b;
  System.out.print("Enter Two Number for Sum: ");
  a=input.nextInt();
  b=input.nextInt();
  int sum=calculateSum(a,b);
  System.out.println("Sum is = "+sum);
  
  
}
}
