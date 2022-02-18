package Lec7;

public class ConstructorExample {
     double width;
     double height;
     double depth;
     
     ConstructorExample()
     {
    	 System.out.println("Constructing Box");
    	 width=0;
    	 height=0;
    	 depth=0;
     }
     
     ConstructorExample(double length)
     {
    	 width=height=depth=length;
    	 
     }
     public ConstructorExample(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	double volume()
     {
    	 return width*height*depth;
     }
     
}
