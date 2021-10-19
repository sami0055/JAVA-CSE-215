import java.util.*;
public class AverageOf3Num {
  public static void main(String[] args)
  {    
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter three number ");
	  double num1=input.nextDouble();
	  double num2=input.nextDouble();
	  double num3=input.nextDouble();
	  double avg=(num1+num2+num3)/3;
	  System.out.println("The average of "+num1+" "+ num2+" "+ num3+" "+" is " +avg);
	  
  }
}
