package QUIZPreparation;

import java.util.Scanner;

public class Task9 {

	static double findArea(double r)
	{
		return Math.PI*r*r;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		double area=findArea(r);
		System.out.println(area);

	}

}
