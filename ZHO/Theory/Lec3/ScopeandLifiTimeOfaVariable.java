package Lec3;

public class ScopeandLifiTimeOfaVariable {

	static int t;
	public static void main(String[] args) {
	
		int x;
		x=10;
		t=10;
		if(x==10)
		{
			int y=20;
			System.out.println("x and y "+x+" "+y);
		}
       // y=100; error occure cause of out of scope
		x=100;//x is always known 
	}

}
