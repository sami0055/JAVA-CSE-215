package Shape;

public class Circle extends Shape {
   private int circled;

private double radius;
   
   private static int circleCounter;
	Circle(double d1) {
		super(d1,-1);
		circleCounter++;
		
	}
	public int setCircled(int circled) {
		return this.circled=circled;
	}
	public int getCircled() {
		return circled;
	}
	public void setRadius(double radius) {
     this.radius=radius;
	}
	public double getRadius() {
	       return this.radius;
	}
	public static int getCircleCounter() {
		return circleCounter;
	}
	public String getName() {
		return "Cricle";
	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	@Override
	public String toString() {
		return "Circle [circled=" + circled + ", radius=" + radius + "]";
	}
   
}
