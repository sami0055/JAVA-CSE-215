package Shape;

public class Square extends Shape{

	public Square(int dim1) {
		super(dim1,-1);
		
	}
	public int area() {
		return dim1*dim1;
	}

}
