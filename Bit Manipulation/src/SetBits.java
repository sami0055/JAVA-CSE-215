import java.util.*;
public class SetBits {

	public static void main(String[] args) {
		int n=5;
		int pos=1;
		int mask=1<<pos;
		int newNumber=mask|n;
		System.out.println(newNumber);

	}

}
