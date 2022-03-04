package MIDPreparation;

public class Car {
 private double weight;
 private double speed_per_gear;
 private int no_of_gear;
 public Car()
 {
	 
 }
public Car(double weight, double speed_per_gear, int no_of_gear) {

	this.weight = weight;
	this.speed_per_gear = speed_per_gear;
	this.no_of_gear = no_of_gear;
}

   public double maxSpeed()
   {
	   return 0.025*weight*speed_per_gear*no_of_gear;
   }
   
   public void Compare(Car c)
   {
	   if(this.maxSpeed()>c.maxSpeed())
		   System.out.println("The car passed as argument is slower");
	   else
		   System.out.println("The car passed as the argument is faster");
   }
}
