
public class Box {

	private double width;
	private double height;
	private double depth;
	
	public Box()
	{
		width=1;
		height=1;
		depth=1;
	}
	public Box(double len)
	{
		width=len;
		height=len;
		depth=len;
	}
	public Box(double width, double height, double depth) {
	
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public Box(Box box)
	{
		this.width=box.width;
		this.height=box.height;
		this.depth=box.depth;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public void setDim(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	public boolean equalTo(Box o)
	{
				
		return this.width==o.width && this.height==o.height && this.depth ==o.depth;
	}
	public double volume()
	{
		return this.getWidth()*this.getHeight()*this.getDepth();
	}
	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}
	
}
