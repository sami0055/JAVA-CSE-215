package ClassRoomMultithreading;
class WhiteBoard{
	String text;
	int numberOfStudents=0;
	int count=0;
	public void attendance() {
		numberOfStudents++;
	}
	synchronized public void write(String t) {
		System.out.println("Teacher is writing..."+t);
		while(count!=0)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			text=t;
			count=numberOfStudents;
			notifyAll();
		
	}
	synchronized public String read() {
		while(count==0)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		String t=text;
		count--;
		if(count==0) {
	   notify();
		}
		return t;
	}
}
class Teacher extends Thread{
		WhiteBoard wb;
		String notes[]= {"Java is language","It is OOP",
				"It is platfrom independent","It's supports Thread","End"};
		
		public Teacher (WhiteBoard w) {
			wb=w;
		}
		public void run() {
			for(int i=0; i<notes.length; i++) {
				wb.write(notes[i]);
				
			}
		}
		
	}

class Students extends Thread{
	String name;
	WhiteBoard wb;
	public Students(String n,WhiteBoard b) {
		name=n;
		wb=b;
	}
	public void run() {
		String text;
		wb.attendance();
		do {
	 		text=wb.read();
			System.out.println("Name: "+name+"Reading "+text);
			System.out.flush();
			
		}while(!text.equals("End"));
		
	}
}

public class ClassRoom {

	public static void main(String[] args) {
	  WhiteBoard wb=new WhiteBoard();
	  Teacher t=new Teacher(wb);
	  Students s1=new Students("1.Jhon",wb);
	  Students s2=new Students("2.Sami",wb);
	  Students s3=new Students("3.Mitu Chowdhury",wb);
	  Students s4=new Students("4.Samiul Alim",wb);
	  t.start();
	  s1.start();
	  s2.start();
	  s3.start();
	  s4.start();
	  
	  

	}

}
