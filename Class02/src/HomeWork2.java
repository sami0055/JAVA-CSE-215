import java.util.*;
public class HomeWork2 {
public static void main(String[] args)
{
	double gratuity,sum,subtotal,rate;
	Scanner input=new Scanner(System.in);
	subtotal=input.nextDouble();
	rate=input.nextDouble();
	gratuity=(subtotal)*(rate/100);
	sum=gratuity+subtotal;
	System.out.printf("The gratuity is "+gratuity+" and total is "+ sum);
	input.close();
}
}
