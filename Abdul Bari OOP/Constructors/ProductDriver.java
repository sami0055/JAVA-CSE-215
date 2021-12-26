package Constructors;

public class ProductDriver {

	public static void main(String[] args) {
	Product p=new Product("A1","Iphone 11 pro max",120000,90);
	System.out.println(p.toString());
    Customer c=new Customer(212121642,"Samiul ALim","Chittagong",12121345);
    System.out.println(c.toString());
	}

}
