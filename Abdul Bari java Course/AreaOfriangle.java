import java.util.*;
public class AreaOfriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float base,height,area;
		System.out.println("Enter Base and height: ");
		base=sc.nextFloat();
		height=sc.nextFloat();
		
		area=1f/2f*base*height;
		System.out.println("Area: "+area);
		
	}

}
