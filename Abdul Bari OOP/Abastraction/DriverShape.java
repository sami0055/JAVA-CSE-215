package Abastraction;

public class DriverShape {

	public static void main(String[] args) {
		Circle c=new Circle(4);
		System.out.println("Area of circle "+c.area());
		Rectangle r=new Rectangle(4,5);
	    System.out.println(r.area());
	    System.out.println(r.perimeter());
	    
	    //Polymorphism
	    
	    Shape c1=new Circle(5);
	    System.out.println(c1.area());
	}

}
