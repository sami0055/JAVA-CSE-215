package Lec3;

public class lec3 {

	public static void main(String[] args) {
		
//	int i=100;
//	int j=200;
//	while(i++<j--);
//	System.out.println(i);
		
		int n=0;
		short t = (short) n;
		long r=0;
	     r=n;
	     n=(int)r;
	     float f=0f;
	     double d=0.0;
	     d=f;
	     d=r;
	     d=n;
	     d=t;
	     f=n;
	     f=t;
	     f=r; //exception here long 8 byte and float 4 byte  but still it's contain long
	     
	     
   
	}

}
