package MultiThreading;
class Yeald extends Thread{
	public void run()
	{
		int count=1;
		while(true) {
			System.out.println(count++ +"thread");
		}
	}
}
public class YealdMethod {

	public static void main(String[] args) {
	Yeald t=new Yeald();
	  t.start();
	  int count =1;
	  while(true) {
		  System.out.println(count++ +"main");
		  Thread.yield();
	  }

	}

}
