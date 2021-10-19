import java.util.*;
public class Product {
	public static int CalculateProduct(int a,int b)
	{
		int pro=a*b;
		return pro;
	}
public static void main(String[] args)
{
	int a,b;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter two Number");
	a=input.nextInt();
	b=input.nextInt();
	int product=CalculateProduct(a,b);
	System.out.println("Product is ="+ product);
	
}
}
