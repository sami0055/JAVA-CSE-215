package Constructors;

public class Customer {
private int custID;// may be string
private String name;
private String address;
private int phone;//Should be string
public Customer() {
	
}
  
public Customer(int custID,String name) {
	  this.custID=custID;
	  this.name=name;
  }
  
public Customer(int custID, String name, String address, int phone) {
	super();
	this.custID = custID;
	this.name = name;
	this.address = address;
	this.phone = phone;
}

public int getCustID() {
	return custID;
}

public String getName() {
	return name;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Customer [custID=" + custID + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
}

}
