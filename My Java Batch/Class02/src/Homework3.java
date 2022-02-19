import java.util.*;
public class Homework3 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	double celsius,fahrenheit;
	System.out.println("Enter Temp in celsius: ");
	celsius=input.nextDouble();
	fahrenheit=(9/5.0)*celsius+32;
	System.out.println(celsius+" Celsius is "+fahrenheit+" Fahreinheit");
	input.close();
	
}
}
