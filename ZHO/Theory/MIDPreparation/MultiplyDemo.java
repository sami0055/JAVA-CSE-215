package MIDPreparation;

public class MultiplyDemo {

	public static void main(String[] args) {
		int i=10;
		double f=3.0;
		float d=2.5f;
		MyMultiply m=new MyMultiply();
	
		m.multiply();
		m.multiply(i);
		m.multiply(i,i);
		m.multiply(d);
		m.multiply(f,d);
		m.multiply(d);

	}

}
