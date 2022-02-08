import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter operator: ");
		char ch=sc.nextLine().charAt(0);
		System.out.println("Enter 1st Operand: ");
	    a=sc.nextInt();
	    System.out.println("Enter 2nd Operand: ");
	    b=sc.nextInt();
		switch(ch)
		{
		case '+':
			System.out.println("Result is: "+(a+b));
			break;
		case '-':
			System.out.println("Result is: "+(a-b));
			break;
		case '*':
			System.out.println("Result is: "+(a*b));
			break;
		case '/':
			System.out.println("Result is: "+(a/b));
			break;
			default:
				System.out.println("Invalid operator");
		}
		
		

	}

}
