
public class MultiplicationTable {

	public static void main(String[] args) {
		int t=1;
		while(t<=5)
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println(i+"X"+t+" = "+(i*t));
			}
			System.out.println();
			t++;
		}

	}

}
