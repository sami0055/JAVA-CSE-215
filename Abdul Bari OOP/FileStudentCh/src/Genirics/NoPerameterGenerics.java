package Genirics;
class Array <T>{
	T A[]=(T[]) new Object[10];
	int length=0;
	public void append(T v) {
		A[length++]=v;
	}
	public void display() {
		for(int i=0; i<length; i++) {
			System.out.println(A[i]);
		}
	}
}
public class NoPerameterGenerics {

	public static void main(String[] args) {
		Array ma=new Array<>();
		ma.append("Hi");
		ma.append("Bye");
		ma.append("Go");
		ma.display();

	}

}
