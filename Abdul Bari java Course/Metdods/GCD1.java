package Metdods;
import java.util.*;
public class GCD1 {
   static int gcd(int x,int y) {
	   int g = 1;
	  for(int i=1; i<=x && i<=y; i++) {
		  if(x%i==0 && y%i==0)
		  g=i;
	  }
	  return g;
   }
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   int g=gcd(a,b);
	   System.out.println(g);
	   

	}

}
