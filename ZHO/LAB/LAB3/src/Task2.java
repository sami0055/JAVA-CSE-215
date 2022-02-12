import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the range: ");
	int min=sc.nextInt();
	int max=sc.nextInt();
	System.out.println("How many randome number?");
	int n=sc.nextInt();
   
	for(int i=1; i<=n; i++)
	{
		int rnum=(int)(Math.random()*(max-min+1)+min);
		System.out.println(rnum);
	}
	
}
}