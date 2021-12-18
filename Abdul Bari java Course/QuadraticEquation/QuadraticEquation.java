package QuadraticEquation;
import java.util.*;
public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a,b,c;
        double r1,r2;
        double d;
        System.out.println("Enter the value of a,b and c:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=b*b-4*a*c;
        if(d>0) {
        	r1=-b+Math.sqrt(d)/(2*a);
            r2=-b-Math.sqrt(d)/(2*a);
            System.out.println("Root1: "+r1+"\nRoot2: "+r2);
        }
        else if(d==0) {
        	r1=-b/(2*a);
        	r2=-b/(2*a);
        	System.out.println("Root1: "+r1+"\nRoot2: "+r2);
        }
        else
        {
        	System.out.println("NO SOLUTION");
        }
        
        
	}

}
