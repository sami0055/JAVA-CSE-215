import java.util.*;
public class Pow {
	public static int PowOFxn(int x,int n) {
		int r;
		if(n==0)
			return 1;
	       
		
		  r=x*PowOFxn(x,n-1);
		 // int rs=r*x;
		  return r;
		
	}
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	int x=input.nextInt();
	int n=input.nextInt();
	int result=PowOFxn(x,n);
	System.out.println(result);
}
}
