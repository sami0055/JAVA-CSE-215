package Lec7;

public class Triangle {
 double side1;
 double side2;
 double angle;
 
 void verValuesRadian(double side1,double side2,double angle)
 {
	 this.side1=side1;
	 this.side2=side2;
	 this.angle=angle;
 }
 void verValuesRadian()
 {
	 this.side1=1;
	 this.side2=1;
	 this.angle=(90/180.0)*3.14;
 }
 void verValuesRadian(double s,double a)
 {
	 side1=s;
	 side2=s;
	 angle=a;
 }
 void valuesDegree(double side1,double side2,double angle)
 {
	 this.side1=side1;
	 this.side2=side2;
	 this.angle=angle/180*3.14;
 }
// double area(double s1,double s2,double a)
// {
//	 return 0.5*s1*s2*Math.sin(a);
// }
   double area()
   {
	   return 0.5*this.side1*this.side2*Math.sin(this.angle);
   }
}

