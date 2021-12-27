package Rectangle;
class Rec{
	public double length;
	public double breadth;
	
	public double area() {
		return length*breadth;
	}
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	public boolean isSquare() {
		if(length==breadth)
			return true;
		else {
			return false;
		}
		
	}
}
public class Rectangle {

	public static void main(String[] args) {
	Rec r1=new Rec();
	r1.length=5;
	r1.breadth=5;
	System.out.println(r1.area());
	System.out.println(r1.perimeter());
	if(r1.isSquare()) {
		System.out.println("Square");
	}
	else {
		System.out.println("Not square");
	}

	}

}
