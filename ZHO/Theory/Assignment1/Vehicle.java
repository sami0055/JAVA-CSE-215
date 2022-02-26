package Assignment1;

public class Vehicle {

	private int passengers;
	private double maxSpeed;
	private String color;
	public Vehicle(int passengers, double maxSpeed, String color) {
		
		this.passengers = passengers;
		this.maxSpeed = maxSpeed;
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double findCapacity()
	{
		return this.passengers*75/(0.20*this.maxSpeed);
		
	}
}
