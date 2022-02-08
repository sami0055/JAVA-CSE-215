package Lec03;

public class LoopExample {

	public static void main(String[] args) {
		boolean done=false;
		int i=0;
		for(; !done;)
		{
			System.out.println("i is "+i);
			if(i==10)
				done =true;
			i++;
		}

	}

}
