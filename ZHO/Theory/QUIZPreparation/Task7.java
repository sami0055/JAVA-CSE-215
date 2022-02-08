package QUIZPreparation;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	
		int n;
		int i=1;
		int sum=0;
		double avg;
		int max=0;
		while(i<=10)
		{
			n=sc.nextInt();
			sum=sum+n;
			if(n>max)
				max=n;
			i++;
			
		}
		avg=sum/10.0;
		System.out.println("Sum: "+sum);
		System.out.println("Max : "+max);
		System.out.println("Avg: "+avg);

	}

}
