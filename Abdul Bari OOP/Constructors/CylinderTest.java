package Constructors;

public class CylinderTest {

	public static void main(String[] args) {
		Cylinder c=new Cylinder(5,6);
		System.out.println("Area:"+c.totalSurfaceArea());
		System.out.println("LidArea: "+c.lidArea());
		System.out.println("Volume: "+c.volume());
		

	}

}
