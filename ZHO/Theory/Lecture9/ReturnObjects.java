package Lecture9;

public class ReturnObjects {

	int a;
	ReturnObjects(int i)
	{
		a=i;
	}
	ReturnObjects incrByTen()
	{
		ReturnObjects temp=new ReturnObjects(a+10);
		return temp;
	}
}
