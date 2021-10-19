import java.util.*;
public class InputRadius {
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	double radius,area;
	System.out.println("Enter radius of a circle");
	 radius=input.nextDouble();
	area=radius*radius*3.1416;
	System.out.println("The area for the circle of radius "+radius+" is "+area);
	
	
}
}
