package Abastraction;

  abstract class Shape {
  abstract public double perimeter();
  abstract public double area();
  
}
class Circle extends Shape {
	double radius;
	

public Circle(double radius) {
		super();
		this.radius = radius;
	}

@Override
public double perimeter() {
	
	return 2*Math.PI*(radius*radius);
}

@Override
public double area() {
	
	return Math.PI*(radius*radius);
}

}
class Rectangle extends Shape{
     
	double length;
	double breadth;
	Rectangle(double length,double breadth){
		
		this.length=length;
		this.breadth=breadth;
		
	}
	@Override
	public double perimeter() {
		
		return 2*(length+breadth);
	}

	@Override
	public double area() {
		
		return length*breadth;
	}
	
}

