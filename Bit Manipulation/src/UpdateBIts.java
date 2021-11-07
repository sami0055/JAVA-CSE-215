import java.util.*;
public class UpdateBIts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ope=sc.nextInt();
		//ope=1 set bit ope=0 clear bit
		int n=5;
		int pos=1;
		int mask=1<<pos;
		if(ope==1) {
			int newNumber=n|mask;
			System.out.println(newNumber);
		}
		else {
			int newBit=~(mask);
			int newNumber=newBit&n;
			System.out.println(newNumber);
		}

	}
  
}
