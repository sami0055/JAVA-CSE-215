package ArrayOfObjects;

import java.util.*;

class Subject{
	
	private String subID;
	private String name;
	private int  maxMarks;
	private int  marksObtain;
	
	public Subject(String subID,String name) {
		this.subID=subID;
		this.name=name;
	}
	public Subject(String subID, String name, int maxMarks, int marksObtain) {
	
		this.subID = subID;
		this.name = name;
		this.maxMarks = maxMarks;
		this.marksObtain = marksObtain;
	}
	public int getMaxMarks() {
		return maxMarks;
	}
	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}
	public int getMarksObtain() {
		return marksObtain;
	}
	public void setMarksObtain(int marksObtain) {
		this.marksObtain = marksObtain;
	}
	public String getSubID() {
		return subID;
	}
	public String getName() {
		return name;
	}
	
	boolean isQualified(int m) {
		return m>=this.maxMarks/10*4;
			
	}
	@Override
	public String toString() {
		return "Subject [subID=" + subID + ", name=" + name + 
				", maxMarks=" + maxMarks + ", marksObtain=" + marksObtain
				+ "]"+"Is Qualified?"+this.isQualified(marksObtain);
	}
	
	
}
public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Subject subs[]=new Subject[3];
		
		for(int i=0; i<subs.length; i++) {
			System.out.println("Enter SubID: ");
			String s=sc.next();
			sc.nextLine();
			System.out.println("Enter Your Name: ");
			String n=sc.nextLine();
			System.out.println("Enter Maxmarks: ");
			int mx=sc.nextInt();
			System.out.println("Enter Obtain Mark: ");
			int bm=sc.nextInt();
			
			subs[i]=new Subject(s,n,mx,bm);
		}
		
		for(int i=0; i<subs.length; i++) {
			System.out.println(".....\t\tSTUDENT INFORMATINO....");
			System.out.println(subs[i].toString());
		}
		
		
		
	  
	}

}
