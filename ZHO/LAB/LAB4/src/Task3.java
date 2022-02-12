import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();
		double sum=0;
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			sum=sum+1.0/-(i*i);
			else {
				sum=sum+1.0/(i*i);
			}
		}
		System.out.println("Sum is :"+sum);
        
	}

}
