import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
        boolean b=true;
        if(n<=1)
        	b=false;
        for(int i=2; i<=n/2; i++)
        {
        	if(n%i==0)
        	{
        		b=false;
        		break;
        	}
        }
        if(b)
        {
        	System.out.println("Prime");
        }
        else {
        	System.out.println("Not Prime");
        }
	}

}
