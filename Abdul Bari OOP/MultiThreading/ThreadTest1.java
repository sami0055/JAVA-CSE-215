package MultiThreading;
class Myrun implements Runnable{
	public void run() {
		
	}
}
public class ThreadTest1 {

	public static void main(String[] args) {
		
    Thread t=new Thread(new Myrun());
    
	}

}
