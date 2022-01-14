package Genirics;

public class GenericDemo1 <T>{
	T data[]=(T[])new Object[3];

	public static void main(String[] args) {
		
		GenericDemo1<String> gd=new GenericDemo1();
		gd.data[0]="Hi";
		gd.data[1]="bye";
		String str=gd.data[0];
		System.out.println(str);
	}

}
