package Shape;

public class Ractangle extends Shape {
    private int rectangled;
    private static int  rectangleCounter;
    private double side1,side2;
    public Ractangle(double side1,double side2) {
		super(side1,side2);
		rectangleCounter++;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public int getRectangled() {
		return rectangled;
	}
	public static int getRectangleCounter() {
		return rectangleCounter;
	}
	public String getName() {
		return "Rectangle";
	}
	public double getArea() {
		return side1*side2;
	}
	
	@Override
	public String toString() {
		return "Ractangle [rectangled=" + rectangled + ", side1=" + side1 + ", side2=" + side2 + "]";
	}
	
	
	
    
}
