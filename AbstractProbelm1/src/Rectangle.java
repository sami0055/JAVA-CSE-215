
public class Rectangle extends Shape{
   private double width;
   private double length;
   
   Rectangle(){
	   

   }
   Rectangle(double width,double length){
	   this.width=width;
	   this.length=length;
   }
   Rectangle(double width,double length,String color,boolean filled){
	   super(color,filled);
	   this.width=width;
	   this.length=length;
   }
	public double getWidth() {
	return width;
}

public void setWidth(double width) {
	this.width = width;
}

public double getLength() {
	return length;
}

public void setLength(double length) {
	this.length = length;
}

	@Override
	double getArea() {
		double area=this.getWidth()*this.getLength();
		return area;
	}

	@Override
	double getPerimeter() {
	double peri =2*(this.getLength()+this.getWidth());
		return peri;
	}
	public String toString() {
		return "Color: "+this.getColor()+" Width: "+this.width+" Length: "+this.width+" isFilled:"+this.isFilled()
		+" Area: "+this.getArea();
	}

}
