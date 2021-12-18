package BitWiseOperator;

public class BitWiseDemo {

	public static void main(String[] args) {
		int x=0b1010,y=0b0110,z;
		int k=x&y;
		z=x|y;
		int xor=x^y;
		System.out.println(z);
		System.out.println(k);
		System.out.println(xor);
		//left shift
		int t=0b1;//1
		int t1=t<<1;//1*2=2
	
		System.out.println(t1);
		//right shift
		int e= -0b1000;//-8
		int e1=e>>1;//-4//as neg sign bit untouch
	     int e2=e>>>1;
	    System.out.println(e1);
		System.out.println(e2);
		//not
		int n=0b1010;//10
		int n1=~n;//-11
		System.out.println(Integer.toBinaryString(n1));
		System.out.println(n1);

	}

}
