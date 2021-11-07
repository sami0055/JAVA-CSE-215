import java.util.*;
public class GetBits {
public static void main(String[] args) {
	int n=5;
	int pos=2;
	int mask=1<<pos;
	if((mask & n)==0) {
		System.out.println("Bit was 0");
	}
	else
	{
		System.out.println("Bit was 1");
	}
}
}
