package MIDPreparation;

public class Point {

	private double abscissa;
	private double ordinate;
	
	public double Distance(Point p)
	{
		double d=Math.sqrt(Math.pow(abscissa-p.abscissa,2)+Math.pow(ordinate-p.ordinate,2));
		return d;
	}
 
	public static Point mid(Point p1,Point p2)
	{
		Point p3=new Point();
		p3.abscissa=(p1.abscissa+p2.abscissa)/2;
		p3.ordinate=(p1.ordinate+p2.ordinate)/2;
		return p3;
	}
}
