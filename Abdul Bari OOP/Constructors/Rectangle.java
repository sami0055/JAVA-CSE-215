package Constructors;

public class Rectangle {
    private double length;
    private double breadth;
    public Rectangle() {
    	length=1;
    	breadth=1;
    }
    public Rectangle(double l,double b) {
    	setLength(l);
    	setBreadth(b);
    }
    public Rectangle(double s) {
    	length=breadth=s;
    }
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double area() {
		return this.getLength()*this.getBreadth();
	}
	public double perimeter() {
		return 2*(this.getBreadth()+this.getLength());
	}
    public boolean isSquare() {
    	if(this.length==this.breadth) {
    		return true;
    	}
    	else
    		return false;
    }
	

}
