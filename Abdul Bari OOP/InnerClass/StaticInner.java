package InnerClass;
class Outer3 {
	int x=10;
	static int y=20;
	static class My{
		public void show() {
			System.out.print(y);
		}
	}
}
public class StaticInner {

	public static void main(String[] args) {
		Outer3.My i=new Outer3.My();
		i.show();

	}

}
