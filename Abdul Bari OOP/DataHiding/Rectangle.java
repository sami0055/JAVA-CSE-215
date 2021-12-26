package DataHiding;
class Rectangle1{
	private double length;
	private double breadth;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public double area() {
		return this.length*this.breadth;
	}
	public  double perimeter() {
		return 2*(length+breadth);

	}
	public boolean isSquare() {
		if(length==breadth) {
			return true;

		}
		else 
			return false;
	}
}
public class Rectangle {

	public static void main(String[] args) {
		Rectangle1 r=new Rectangle1();
		r.setLength(10);
		r.setBreadth(6);
		System.out.println(r.area());
		System.out.println(r.perimeter());
		System.out.println("Is Square: "+r.isSquare());

	}

}
