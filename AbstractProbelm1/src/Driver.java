
public class Driver {

	public static void main(String[] args) {
		Shape obj[]=new Shape[2];
	    obj[0]=new Circle(5,"Black",true);
	    obj[1]=new Rectangle(10,30,"RED",false);
	    
	    for(int i=0; i<obj.length; i++) {
	    	if(obj[i] instanceof Circle) {
	    		System.out.println(((Circle)obj[i]).toString());
	    	}
	    	else {
	    		System.out.println(((Rectangle)obj[i]).toString());
	    	}
	    }

	}

}
