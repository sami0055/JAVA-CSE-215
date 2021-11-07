import java.util.*;
public class Circle {
	double r;
  public Circle() {
	  r=0;
  }
  public Circle(double r) {
	  this.r=r;
  }
  public double Getarea() {
	  return Math.PI*Math.pow(r, 2);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the redius of circle: ");
		double n=sc.nextDouble();
         Circle a=new Circle(n);
        System.out.println(a.Getarea());
         
	}

}
