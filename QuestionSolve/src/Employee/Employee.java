package Employee;
interface TaxCalculator{
	public static int TAX_PERCENT=15;
	public double yearlyIncomeTax();
	public double yearlyIncomeWithoutTax();
	
}
public abstract class Employee {
  private int id;
  private String name;
  private int age;
public Employee(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
 public abstract int yearlySalary();
 public abstract int yearlyIncome();
}
