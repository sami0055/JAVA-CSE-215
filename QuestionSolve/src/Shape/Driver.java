package Shape;

public class Driver {

	public static void main(String[] args) {
		Circle c1=new Circle(0);
		c1.setRadius(5);
		System.out.println(c1.getArea());
		c1.setCircled(56767);
		System.out.println(c1.getCircled());
		Circle c2=new Circle(0);
		
		Ractangle r1=new Ractangle(4, 5);
	    r1.setSide1(4);
	    r1.setSide2(5);
		System.out.println("Ractengle area: "+r1.getArea());
		Ractangle r2=new Ractangle(3,3);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(r1.getName());
		System.out.println(r1.toString());
				
		System.out.println(Circle.getCircleCounter());
		System.out.println(Ractangle.getRectangleCounter());
		



}
	}
