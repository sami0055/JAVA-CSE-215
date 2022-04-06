
public class Driver {

	public static void main(String[] args) {
		PartTimeEmployee p1=new PartTimeEmployee("Samiul Alim",20,"Dhaka","ECE","X",20,80);
		System.out.println("PartTimeEmployee Salary: "+p1.salary());
		System.out.println(p1.toString());
		
		FullTimeEmployee f1=new FullTimeEmployee("Sami",22,"Dhaka Bashundhara","ECE","Y",15000,25);
		System.out.println("Full Time Employee Salary: "+f1.salary());
		System.out.println(f1.toString());
	}
	

}
