package ArrayOfObject;

import java.util.Scanner;

class Subject{
	private String subID;
	private String name;
   private int maxMarks;
   private int marksObtain;
public Subject(String subID, String name, int maxMarks, int marksObtain) {
	
	this.subID = subID;
	this.name = name;
	this.maxMarks = maxMarks;
	this.marksObtain = marksObtain;
}
  
public void setObtainMarks(int marksObtain)
{
	this.marksObtain=marksObtain;
}
 public int getObtainMarks()
 {
	 return marksObtain;
 }
  public void setmaxMarks(int maxMarks)
  {
	  this.maxMarks=maxMarks;
  }
  public int getmaxMarks()
  {
	  return maxMarks;
  }
 
  public String getName()
  {
	  return name;
  }
  public String getSubID() {
	  return subID;
  }
  boolean isQualified(int m) {
	  return m>=(this.getmaxMarks()/(10*4));
  }

@Override
public String toString() {
	return "Subject [subID=" + subID + ", name=" + name + ", maxMarks=" + maxMarks + ", marksObtain=" + marksObtain
			+ "]"+"IS Qualified?? "+this.isQualified(marksObtain);
}


  
  
}
public class ArrayOfSubject {

	public static void main(String[] args) {
	  
		Scanner sc=new Scanner(System.in);
		Subject []S=new Subject[3];
		System.out.println("Enter your Information: ");
		for(int i=0; i<S.length; i++)
		{
			System.out.println("Enter your sub ID: ");
			String subId=sc.next();
			sc.nextLine();
			System.out.println("Enter your name: ");
			String name=sc.nextLine();
			System.out.println("Enter  maxMarks: ");
			int max=sc.nextInt();
			System.out.println("Enter Obtain Mark");
			int ob=sc.nextInt();
			S[i]=new Subject(subId,name,max,ob);
		}
		for(int i=0; i<S.length; i++)
		{
			System.out.println(S[i].toString());
		}

	}

}
