package OverridingExample;
class car{
	public void start() {
		System.out.println("Car started");
	}
	public void accelerated() {
		System.out.println("Car is Accelerated");
	}
	public void changeGear() {
		System.out.println("Car gear is changed");
	}
	
}

class LuxaryCar extends car{
	public void changeGear() {
		System.out.println("Automatic Gear");
	}
	public void openRoof() {
		System.out.println("Sun roof is opened");
	}
}
public class OverridingExample {

	public static void main(String[] args) {
//	   car c=new car();
//	   c.start();
//	   c.accelerated();
//	   c.changeGear();
	   
	   LuxaryCar lc=new LuxaryCar();
	   lc.start();
	   lc.accelerated();
	   lc.changeGear();//override
	   lc.openRoof();//new feature
	   
	   car c1=new LuxaryCar();
	   c1.start();
	   c1.accelerated();
	   c1.changeGear();
	//   c1.openRoof(); not feature of car(refrence)
	   

	}

}
