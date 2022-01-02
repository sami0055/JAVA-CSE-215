package MultiThreading;

public class RunnableThread2 implements Runnable{
	

	public static void main(String[] args) {
		RunnableThread2 m=new RunnableThread2();
		Thread t=new Thread(m);
		t.start();
		int i=1;
		while(true){
			System.out.println(i+"World");
			i++;
		}

	}

	int i=1;
	@Override
	public void run() {
		while(true) {
			System.out.println(i+"Hello");
			i++;
		}
		
	}

}
