import java.util.*;
public class LogarathmicFunction {
	public static int pow(int x,int n) {
		if(n==0)
			return 1;
		int xpnb2=pow(x,n/2);
		int xn=xpnb2*xpnb2;
		if(n%2==1)
	    xn=xn*x;		
		return xn;		
	}
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int x=input.nextInt();
	int n=input.nextInt();
	int r=pow(x,n);
	System.out.println(r);
}

}
