package Lec03;

public class BreakLabel {

	public static void main(String[] args) {
	
		first:for(int i=0; i<10; i++)
			{
			for(int j=0; j<10; j++)
			{
				if(j==5)
					break first;
				System.out.println(j);
			}
		}
		System.out.println("After breaking first block");

	}

}
