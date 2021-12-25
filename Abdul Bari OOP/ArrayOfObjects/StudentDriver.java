package ArrayOfObjects;
import java.util.*;
public class StudentDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student S[]=new Student[2];
		for(int i=0; i<S.length; i++) {
			System.out.println("Enter Your ID: ");
			String id=sc.nextLine();
		
			System.out.println("Enter your Name: ");
			String name=sc.nextLine();
			
			System.out.println("Enter your dept name: ");
			String dept=sc.nextLine();
			
			System.out.println("How many course your want to do?: ");
		
			int nfo=sc.nextInt();
	        
			String [] s=new String[nfo];
			for(int j=0; j<s.length; j++) {
			   
			 s[j]=sc.nextLine();
			}
		    S[i]=new Student(id,name,dept,s);
		}
		
		for(int i=0; i<S.length; i++) {
			System.out.println(S[i].toString());
		}

	}

}
