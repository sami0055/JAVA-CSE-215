package Quiz3;

public class Shape {

	private double dimension1;
	private double dimension2;
	public Shape(double d1,double d2)
	{
		this.dimension1=d1;
		this.dimension2=d2;
	}
	public double getDimension1() {
		return dimension1;
	}
	public void setDimension1(double dimension1) {
		this.dimension1 = dimension1;
	}
	public double getDimension2() {
		return dimension2;
	}
	public void setDimension2(double dimension2) {
		this.dimension2 = dimension2;
	}
	public String getName()
	{
		return "Shape";
	}
	public double getArea()
	{
		return 0;
	}
	@Override
	public String toString() {
		return "Shape [dimension1=" + dimension1 + ", dimension2=" + dimension2 + ", Name= " + getName()
				+ ", Area= " + getArea() + "]";
	}
	
	
}
