package Lecture9;

public class RefPass {

	int a,b;
	RefPass(int i,int j)
	{
		a=i;
		b=j;
	}
	//pass and object
	void meth(RefPass o)
	{
		o.a*=2;
		o.b/=2;
	}
}
