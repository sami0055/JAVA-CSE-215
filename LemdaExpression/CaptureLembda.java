package LemdaExpression;

interface Lambda{
	public void display();
}
class Demo{
	int temp=10;
	public void method1() {
		int count=0;
		MyLambda m1=()->{
			int x=0;
			System.out.println("hello "+(++temp));
			System.out.println("bye "+count);
			System.out.println(++x);
		};
		m1.display();
		//count++;
	}
}

public class CaptureLembda {

	public static void main(String[] args) {
	
		Demo d=new Demo();
		d.method1();
	}

}
