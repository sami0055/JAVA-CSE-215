package BankAccount;
import java.util.*;
public class Account {
  private String Accno;
  private String name;
  private String address;
  private String phone;
  private String dob;
  protected long balance;
  
  Scanner sc=new Scanner(System.in);
public Account(String accno, String name, String address, String phone, String dob) {
	super();
	Accno = accno;
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.dob = dob;
	this.balance = 0;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAccno() {
	return Accno;
}
public String getName() {
	return name;
}
public String getDob() {
	return dob;
}
public long getBalance() {
	System.out.println("Enter your account number for check your current balance:  ");
	String ac=sc.nextLine();
	if(ac.equals(this.getAccno()))
	return balance;
	else {
		System.out.println("Invalid input");
		return 0;
	}
	
}
  
  
  
  
}
