import java.util.*;
public class ComputeAreaWithConstant {
public static void main(String[] args)
{
	final double PI=3.141659;//constant declare
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a radius for circle ");
	double radius=input.nextDouble();
	 double area=PI*radius*radius;
	System.out.println("The area for the circle of radius "+radius+" is "+area);
}
}
