import java.until.*;
import java.util.Scanner;
public class SumofN {

	public static void main(String[] args) {
    
   int i,n,sum=0;
   Scanner sc=new Scanner(System.in);qa1	ZX
   	System.out.println("Enter a Number\n");
   n=sc.nextInt();
    while(1==1)
    {   
    	sum=0;
    	 for(i=1; i<=n; i++)
  	   {
  		   sum=sum+i;
  	   }
     
     System.out.println(sum);
     n=sc.nextInt();
     if(n==0)
    	break;
    }
	  
	}

}
