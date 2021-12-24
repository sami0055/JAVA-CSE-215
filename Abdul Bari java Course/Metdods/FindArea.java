package Metdods;
import java.util.*;
public class FindArea {
   static double area1(double x,double y) {
	   return x*y;
   }
   static double area1(double r) {
	   return Math.PI*r*r;
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b;
		System.out.println("Enter hight and width");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Enter radius: ");
		double r=sc.nextDouble();
		double rac=area1(a,b);
		double circlear=area1(r);
		System.out.println("Area of ractangle:"+rac);
		System.out.println("Area of circle: "+circlear);
		
		
	}

}
