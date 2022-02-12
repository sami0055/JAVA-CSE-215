import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two cities: ");
		String c1=sc.nextLine();
		String c2=sc.nextLine();
		if(c1.compareTo(c2)<0)
		{
			System.out.println("The cities in alphabetical order are "+c1+" and "+c2);
			
		}
		else {
			System.out.println("The cities in alphabetical order are "+c2+" and "+c2);
		}
		

	}

}
