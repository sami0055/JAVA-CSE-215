package Lec7;

public class TriangleDemo {

	public static void main(String[] args) {
		Triangle t1=new Triangle();
		t1.valuesDegree(6, 8, 30);
//		t1.side1=6;
//		t1.side2=8;
//		t1.angle=30.0/180*3.1416;
		
		Triangle t2=new Triangle();
		t2.valuesDegree(2, 7, 90);
//		t2.side1=2;
//		t2.side2=7;
//		t2.angle=90.0/180*3.1416;
		
	//	double area1,area2;
		
//		area1=0.5*t1.side1*t1.side2*Math.sin(t1.angle);
//		area2=0.5*t2.side1*t2.side2*Math.sin(t2.angle);
		
//		System.out.println("Area1: "+t1.area(t1.side1, t1.side2, t1.angle));
//		System.out.println("Area2: "+t1.area(t2.side1, t2.side2, t2.angle));
		
		System.out.println("Area1: "+t1.area());
		System.out.println("Area2: "+t2.area());

	}

}
