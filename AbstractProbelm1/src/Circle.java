
public class Circle extends Shape{
  private double radius;
  Circle(){
	  
  }
  Circle(double radius){
	  this.radius=radius;
  }
  Circle(double radius,String color,boolean filled){
	  super(color,filled);
	  this.radius=radius;
  }
	public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

	@Override
	double getArea() {
	
		return Math.PI*Math.pow(getRadius(), 2);
	}

	@Override
	double getPerimeter() {
		
		return 2*Math.PI*this.getRadius();
	}
	public String toString() {
		return "Color: "+this.getColor()+" Radius: "+this.getRadius()+" isFilled:"+this.isFilled()
		+" Area: "+this.getArea();
	}

}
