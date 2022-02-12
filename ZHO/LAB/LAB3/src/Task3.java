import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char ch=sc.nextLine().charAt(0);
		if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z'))
		{
			System.out.println(ch+" is a Letter");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println(ch+" is a Digit");
		}
		else {
			System.out.println(ch +" is a Symbol");
		}
	}

}
