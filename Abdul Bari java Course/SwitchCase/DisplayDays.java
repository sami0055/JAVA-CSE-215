package SwitchCase;
import java.util.*;
public class DisplayDays {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a Number to check days name: ");
	  int n=sc.nextInt();
	  switch(n) {
	  case 1: System.out.println("Mon");
	  break;
	  case 2: System.out.println("Sun"); 
	  break;
	  case 3: System.out.println("Thu");
	  case 4: System.out.println("WED");
	  break;
	  case 5: System.out.println("THuresday");
	  break;
	  case 6:
		  System.out.println("Friday");
		  break;
	  case 7:
		  System.out.println("Sat");
		  break;
		 default:
			 System.out.println("Invalid input");
	  }

	}

}
