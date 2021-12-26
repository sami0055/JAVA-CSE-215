package Constructors;

public class Cylinder {
  private double radius;
  private double height;
  
  public Cylinder() {
	  radius=1;
	  height=1;
  }
  public Cylinder(int radius){
	   setRadius(radius);
   }
  public Cylinder(double radius,double height) {
	  setRadius(radius);
	  setHeight(height);
  }
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double lidArea() {
	return (Math.PI*radius*radius);
}
public double totalSurfaceArea() {
	return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
}
public double volume() {
	return Math.PI*radius*radius*height;
}
public double circumference() {
	return totalSurfaceArea();
	
}
}
