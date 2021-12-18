package BitWiseOperator;
import java.util.*;
public class BitwiseMasking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two number: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("A= "+a+" B= "+b);
		//swapping number
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("A= "+a+" B= "+b);
		
	}

}
