package Quiz3;

public class Circle extends Shape{

	
	private int circleid;
	private static int circleCounter=0;
	
	
	public Circle(double radius)
	{
		super(radius,radius);
		circleCounter++;
		this.circleid=circleCounter;
	}
	public void setRadius(double radius)
	{
		this.setDimension1(radius);
	}
	public double getRadius()
	{
		return this.getDimension1();
	}
	public int getCircleid()
	{
		return circleid;
	}
	public static int getCircleCounter()
	{
		return circleCounter;
	}
	public String getName()
	{
		return "Circle";
	}
	
	public double getArea()
	{
		return Math.PI*this.getRadius()*this.getRadius();
	}
	@Override
	public String toString() {
		return "Circle [circleid=" + circleid + ",Name= " + getName() + ", Area= " + getArea() + "Circle Count "+getCircleCounter()+" Radius "+getRadius();
	}
	
	
}
