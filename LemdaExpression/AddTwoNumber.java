package LemdaExpression;
interface MyLambda1{
	public int add(int x,int y);
}
public class AddTwoNumber {

	public static void main(String[] args) {
	MyLambda1 m=(a,b)->a+b;
	int r=m.add(5, 5);
	System.out.println(r);
	}

}
