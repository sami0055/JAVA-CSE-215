
import java.util.Scanner;
public class Sm {

	public static void main(String[] args) {
		char operator;
		
		
		Scanner scan = new Scanner(System.in);
		
		double num1, num2,result=0;
	
		System.out.println("Enter operator : ");
		operator = scan.next().charAt(0);
		
		System.out.println("Enter 1st Operand : ");
		num1 = scan.nextDouble();
		
		System.out.println("Enter 2nd Operand : ");
		num2 = scan.nextDouble();
		
		scan.close();
		
		switch(operator) {
		    case '+' :
			    result = num1 + num2;
			    break;
			
		    case '-' :
		    	result = num1 - num2;
		    	break;
		    	
		    case '*' :
		    	result = num1 * num2;
		    	break;
		    	
		    case '/' :
		    	result = num1 / num2;
		    	break;
		    	
		    default :
		    	System.out.println("Invalid operator!");
		}
		System.out.println(num1+" "+operator+" "+num2+" : "+result);

	}

}