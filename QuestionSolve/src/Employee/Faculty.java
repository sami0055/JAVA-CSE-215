package Employee;

public class Faculty extends Employee implements TaxCalculator {
     private String initial;
     private int monthlySalary;
     private int  yearlyBonus;
	public Faculty(String initial,int monthlySalary,int yearlyBonus,int id, String name, int age) {
		super(id, name, age);
		this.initial=initial;
		this.monthlySalary=monthlySalary;
		this.yearlyBonus=yearlyBonus;
		
	}
	
	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public int getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(int yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	public int yearlySalary() {
		return this.monthlySalary*12;
	}
	 public  int yearlyIncome() {
		 return this.yearlySalary()+this.getYearlyBonus();
	 }
	 public double yearlyIncomeTax() {
		return ((this.yearlyIncome())*(15/(double)100));
		 
	 }
	 public double yearlyIncomeWithoutTax() {
		 return (this.yearlyIncome()-this.yearlyIncomeTax());
	 }

	@Override
	public String toString() {
		return "Faculty initial " + initial + "\nMonthlySalary " + monthlySalary + "\nYearlyBonus " + yearlyBonus
				+ "\nYearlySalary "+this.yearlySalary()+"\nYearly total Income "+this.yearlyIncome()
				+"\nYearlyIncomeTax "+this.yearlyIncomeTax()+"\nYearlyIncome Without tax "+this.yearlyIncomeWithoutTax();
	}
	 
}
