import java.util.Scanner;

public class Radom {

	public static void main(String[] args) {
		
		// formula (upper-lower+1)+lower
//		int lower=1;
//		int upper=6;
	   Scanner sc=new Scanner(System.in);
	 //  System.out.println("Enter your range: ");
//	     int lower=sc.nextInt();		
//	     int upper=sc.nextInt();
	   
	    int lower=100;
		int upper=105;
		
		int rum=(int) (Math.random()*(upper-lower+1)+lower);
		System.out.println(rum);
		

	}

}
