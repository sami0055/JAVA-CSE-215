package Constructors;

public class Product {
  private String itemno;
  private String name;
  private double price;
  private int dty;
  
  public Product() {
	  
  }
  public Product(String itemno) {
	  this.itemno=itemno;
  }
  public Product(String itemno,String name) {
	  this.itemno=itemno;
	  this.name=name;
  }
public Product(String itemno, String name, double price, int dty) {
	super();
	this.itemno = itemno;
	this.name = name;
	this.price = price;
	this.dty = dty;
}
public String getItemno() {
	return itemno;
}

public String getName() {
	return name;
}

public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getDty() {
	return dty;
}
public void setDty(int dty) {
	this.dty = dty;
}
@Override
public String toString() {
	return "Product [itemno=" + itemno + ", name=" + name + ", price=" + price + ", dty=" + dty + "]";
}


  
}
