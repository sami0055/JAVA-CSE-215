package Static;
class Test{
	static int x=10;
	int y=20;
	void show() {
		System.out.println(x+" "+y);//non static method also 
		//access static properties
	}
	static void display() {
		//static method can't be access non static properties
		System.out.println(x);//y can't be accessable
	}
}
public class StaticPractice {

	public static void main(String[] args) {
		Test t1=new Test();
		t1.show();
		Test t2=new Test();
		t2.show();

	}

}
