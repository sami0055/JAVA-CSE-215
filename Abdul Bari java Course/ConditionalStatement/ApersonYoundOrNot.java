package ConditionalStatement;
import java.util.*;
public class ApersonYoundOrNot {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age: ");
	int a=sc.nextInt();
	if(a<14 || a>55)
		System.out.println("Not young");
	else if(a>=14 && a<=55)
		System.out.println("Old");
		
	}

}
