package Quiz3;

public class Driver {

	public static void main(String[] args) {
		
		Circle c1=new Circle(4.5);
		Circle c2=new Circle(3.3);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println();
		
		Rectangle r1=new Rectangle(4,5);
		Rectangle r2=new Rectangle(5,5);
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println();
		System.out.println("Total number of Cirlce: "+Circle.getCircleCounter());
		System.out.println("Total number of Rectanle : "+Rectangle.getRectangleCounter());

	}

}
