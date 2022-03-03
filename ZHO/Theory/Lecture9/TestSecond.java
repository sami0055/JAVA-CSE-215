package Lecture9;

public class TestSecond {

	int a;
	TestSecond(int x)
	{
		a=x;
	}
	int addObject(TestFirst t)
	{
		return (a+t.add());
	}
}
