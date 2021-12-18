package Cuboid;
import java.util.*;
public class Cuboid {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter : length,height,and breath of Cuboid: ");
	  double lenght,height,breath,front_area,right_area,bottom_area,total_area,volume,perimeter;
	  lenght=sc.nextDouble();
	  height=sc.nextDouble();
	  breath=sc.nextDouble();
	  
	  front_area=lenght*height;
	  right_area=breath*height;
	  bottom_area=lenght*breath;
	  
	  total_area=2*((front_area+right_area+bottom_area));
	  volume=lenght*height*breath;
	  perimeter=2*(lenght+breath);
	  
	  System.out.println("Area: "+total_area+"\nVolume: "+volume+"\nPerimeter: "+perimeter);
	  
	  
  }
}
