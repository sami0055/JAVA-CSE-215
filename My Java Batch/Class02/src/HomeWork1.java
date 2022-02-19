import java.util.*;
public class HomeWork1 {
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	double weight,height;
	System.out.println("Enter weight and height in pound and inch");
	weight=input.nextDouble();
	height=input.nextDouble();
	double kg=weight*(0.45359237);
    double meter=height*0.0254;
    double BMI=kg/(meter*meter);
    System.out.printf("BMI is "+"%.4f",BMI);
    
	
}
}
