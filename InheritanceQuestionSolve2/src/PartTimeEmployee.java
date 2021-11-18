
public class PartTimeEmployee extends Employee{
	private double hours;
	private double rete;
	PartTimeEmployee(){
		
	}
	PartTimeEmployee(String name,int age,String address
			,String department,String designation,double hours,double rate ){
      super(name,age,address,department,designation);
      this.hours=hours;
      this.rete=rate;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getRete() {
		return rete;
	}
	public void setRete(double rete) {
		this.rete = rete;
	}
	public double salary() {
		return  this.getHours()*this.getRete();
	
	}

}
