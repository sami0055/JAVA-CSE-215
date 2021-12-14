
abstract public class Product {
	private String name;
	private double price;
	
	Product(){
		
	}
	Product(String name,double price){
		this.name=name;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	abstract public void changePrice(double percentage);
	 public String toString() {
		 return "Name: "+this.getName()+" Price: "+this.getPrice();
	 }
		
	
	
	

}
