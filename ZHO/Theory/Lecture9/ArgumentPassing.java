package Lecture9;

// Primitive types are passed by value

class Argument{
	void meth(int i,int j)
	{
		i*=2;
		j/=2;
	}
}
public class ArgumentPassing {

	public static void main(String[] args) {
	
	    Argument on=new Argument();
		int a=15,b=20;
		System.out.println("Before call by value: "+a+" "+b);
		on.meth(a, b);
		System.out.println("After call by value: "+a+" "+b);
		
	}

}
