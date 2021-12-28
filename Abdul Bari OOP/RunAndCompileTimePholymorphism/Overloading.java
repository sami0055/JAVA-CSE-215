package RunAndCompileTimePholymorphism;
class Test{
	public int max(int a,int b) {
	return a>b?a:b;	
	}
	public int max(int a,int b,int c) {
		if(a>b && a>c)
			return a;
		else if(b>c) {
			return b;
		}
		else return c;
	}
}
public class Overloading {

	public static void main(String[] args) {
		//Method overloading is a compile time Polymorphism
		Test t=new Test();
		t.max(5, 7);
		t.max(55, 33,22);

	}

}
