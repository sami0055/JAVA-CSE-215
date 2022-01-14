package SCI03;

import java.io.Serializable;

public class Customer implements Serializable {
	
	String custID;
	String name;
	String phno;
	static int count=1;
	Customer(){
		
	}
	public Customer(String n,String p){
		custID="C"+count;
		count++;
		name=n;
		phno=p;
	}
	

	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", name=" + name + ", phno=" + phno + "]";
	}
	

}
