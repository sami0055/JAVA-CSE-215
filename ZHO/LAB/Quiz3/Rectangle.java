package Quiz3;

public class Rectangle extends Shape{

	private int rectangleid;
	private static int rectangleCounter=0;
	public Rectangle(double side1, double side2) {
		super(side1, side2);
		rectangleCounter++;
		this.rectangleid=rectangleCounter;
		
	}
	public double getSide1()
	{
		return getDimension1();
	}
	public void getSide1(double side1)
	{
		this.setDimension1(side1);
	}
	public double getSide2()
	{
		return getDimension2();
	}
	public void setSide2(double side2)
	{
		this.setDimension2(side2);
	}
	
	public int getRectangleId()
	{
		return rectangleid;
	}
	public static int getRectangleCounter()
	{
		return rectangleCounter;
	}
	public String getName()
	{
		return "Rectangle";
	}
	public double getArea()
	{
		return this.getDimension1()*this.getDimension2();
	}
	@Override
	public String toString() {
		return "Rectangle [rectangleid=" + rectangleid + ", getSide1()=" + getSide1() + ", getSide2()=" + getSide2()
				+ ", getRectangleId()=" + getRectangleId() + ", getName()=" + getName() + ", getArea()=" + getArea()
				+ " Rectangle Counter: "+getRectangleCounter();
	}
	

}
