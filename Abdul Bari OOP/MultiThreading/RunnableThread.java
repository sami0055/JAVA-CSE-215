package MultiThreading;
 class My implements Runnable{

	 int i=1;
	@Override
	public void run() {
		while(true) {
			System.out.println(i+"Hello");
			i++;
		}
		
	}
	 
 }
public class RunnableThread {

	public static void main(String[] args) {
		My m=new My();
		Thread t= new Thread(m);
		t.start();
		int i=1; 
		while(true) {
			
			System.out.println(i+" World");
			i++;
		}

	}

}
