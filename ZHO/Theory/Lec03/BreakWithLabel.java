package Lec03;

public class BreakWithLabel {

	public static void main(String[] args) {
	
		boolean t=true;
		first:{
			second:{
				third:{
					System.out.println("Before the break");
					if(t)
						break first;
					
				}
			}
			System.out.println("After breaking second block");
		}
		System.out.println("After breaking first block");

	}

}
