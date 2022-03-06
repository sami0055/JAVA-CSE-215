package MunnaTask2;

public class Driver {

	public static void main(String[] args) {
		
		FullTimeEmployee f1=new FullTimeEmployee("Munna",20,"Dhaka,Bashundhara","ECE","xy",15000,25);
		System.out.println(f1.salary());
		
		PartTimeEmployee p1=new PartTimeEmployee("Sami",20,"Dhaka,Bashundhara","ECE","xyz",10,1000);
		System.out.println(p1.salary());
	}

}
