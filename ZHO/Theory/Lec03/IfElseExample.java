package Lec03;

public class IfElseExample {

	public static void main(String[] args) {
		
		int i=10,j=15,k=70;
		int a=0,b=30,c=40,d=20;
		if(i==d/2)
		{
			if(j<20)
				a=b;
			if(k>100)
				c=d;
			else {
				a=c;
			}
			
		}
		else {
			a=d;
		}
      System.out.println(a);
	}

}
