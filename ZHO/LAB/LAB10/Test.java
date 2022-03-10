package Task2;
public class Test {

	public static void main(String[] args) {
		
		Point p=new Point(0,0);
		Point q=new Point(3,4);
		Line a=new Line(p,q);
		Line b=new Line(0,0,3,4);
		System.out.println("Length: "+a.getLength());
		System.out.println("Length: "+b.getLength());
		
	}

}