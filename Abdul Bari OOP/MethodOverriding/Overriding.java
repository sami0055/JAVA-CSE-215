package MethodOverriding;
class TV{
	public void switchON() {
		System.out.println("TV is switched ON");
	}
	public void changeChannel() {
		System.out.println("TV channl is Changed");
	}
}

class SmartTV extends TV{
	public void switchON() {
		System.out.println("Smart TV is switched ON");

	}
	public void changeChannel() {
		System.out.println("SmartTV channel is changing");
	}
	public void browse() {
		System.out.println("Smart tv Browsing");
	}
}

public class Overriding {

	public static void main(String[] args) {
//	  TV t=new TV();
//	  t.switchOn();
//	  t.changeChannel();
//	  SmartTV ts=new SmartTV();
//	  ts.browse();
//	  ts.switchON();
//	  ts.changeChannel();
	  
		//dynamic method dispatch
	  TV t1=new SmartTV();
	//  t1.browse();//not possible
     t1.changeChannel();
     t1.switchON();
	}

}
