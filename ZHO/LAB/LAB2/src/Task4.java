import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double a,b,c,root1,root2;
		a=sc.nextDouble();
		b=sc.nextDouble();
	   c=sc.nextDouble();
		double real,ima;
		
		double d=(b*b)-4*a*c;
		if(d>0)
		{
			root1 = (-b + Math.sqrt(d)) / (2 * a);
	        root2 = (-b - Math.sqrt(d)) / (2 * a);
	        System.out.print("Root 1"+root1);
	        System.out.println("Root 2: "+root2);
		}
		else if(d==0)
		{
			 root1 = root2 = -b / (2 * a);
			 System.out.print("Root 1"+root1);
		     System.out.println("Root 2: "+root2);
		}
		
		else {
			real=-b/(2*a);
			ima=Math.sqrt(-d)/(2*a);
			System.out.println("Root 1: "+real+"+"+ima+"i");
			System.out.println("Root 2: "+real+"+"+ima+"i");
		}
	

	}

}
