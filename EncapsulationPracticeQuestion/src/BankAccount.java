
public class BankAccount {
  private String name;
  private int accno;
  private int pin;
  private double balance;
  private String address;
  public BankAccount() {
	  
  }
 public BankAccount(String name,int accno,String address){
	  this.name=name;
	  this.accno=accno;
	  this.address=address;
  }
 public BankAccount(String name,int accno,int pin,double balance,String address) {
	 this.name=name;
	 this.accno=accno;
	 this.pin=pin;
	 this.balance=balance;
	 this.address=address;
	 
	 
	 
 }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAccno() {
	return this.accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public int getPin(int key) {
	
	return key;
}
public void setPin(int key) {
	this.pin=key;
	
}
public double getBalance(int key) {
	
	if(key==this.pin) {
		return this.balance;
	}
	return key;
	
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getAddress(int key) {
	if(key==this.pin) {
		return this.address;
	}
	return address;	
}

public void setAddress(String address) {
	this.address = address;
}
public void withdraw(double amount) {
    this.balance=this.balance-amount;
}
public void deposite (double amount) {
	this.balance=this.balance+amount;
}
 public double checkBalance(int key) {
	 if(key==this.pin) {
		 return this.balance;
	 }
	return key;
 }
@Override
public String toString() {
	return "BankAccount [name=" + name + ", accno=" + accno + ", pin=" + pin + ", balance=" + balance + ", address="
			+ address + "]";
}
   
}
