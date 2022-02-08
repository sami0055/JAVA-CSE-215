import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		boolean b=true;
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n<=1) {
	    	b=false;
	    }
	    for(int i=2; i<=n/2; i++)
	    {
	    	if(n%i==0)
	    		b=false;
	    	break;
	    }
	    if(b)
	    {
	    	System.out.println(n+" is prime ");
	    }
	    else {
	    	System.out.println(n+" is Not prime : ");
	    }
		

	}

}
