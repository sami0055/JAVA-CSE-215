import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n%2) {
		case 0:
			System.out.println("Number is Even");
			break;
		case 1:
			System.out.println("Number is Odd");
			break;
			default:
				System.out.println("Invalid number");
				
				
		}
	}

}
