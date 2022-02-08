import java.util.Scanner;

public class SumOfNinteger {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,sum=0,num;
		while(i<=n)
		{
			System.out.println("Enter a Number: ");
			num=sc.nextInt();
			sum=sum+num;
			i++;
		}
		System.out.println(sum);

	}

}
