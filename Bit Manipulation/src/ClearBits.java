import java.util.*;
public class ClearBits {

	public static void main(String[] args) {
		int n=5;
		int pos=2;
		int mask=1<<pos;
		int notmask=~(mask);
		int newNumber=notmask&n;
		System.out.println(newNumber);

	}

}
