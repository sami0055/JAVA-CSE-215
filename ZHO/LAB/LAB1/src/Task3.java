import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println(n+" is Even");
		}
		else {
			System.out.println(n+" is ODD");
		}

	}

}
