package MunnaTask2;

public class FullTimeEmployee extends Employee{
	
	private double basic;
	private double allowance;
	public FullTimeEmployee(String name, int age, String address, String department, String designation, double basic,
			double allowance) {
		super(name, age, address, department, designation);
		this.basic = basic;
		this.allowance = allowance;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	@Override
	public String toString() {
		return super.toString()+"basic=" + basic + ", allowance=" + allowance;
	}
	
	public double salary()
	{
		return this.basic+(this.allowance/100)*(this.basic);
	}

}
