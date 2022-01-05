package JavaLangPackage;

enum Dept{
	CS("Samiul ALim","Block A Road #2"),IT("MItu ","Blockb")
	,CIVIL("Sami","Block C"),ECE("Sam","Block D");
	
	String head;
	String location;
	private Dept() {
		System.out.print(this.name()+" ");
	}
	Dept(String head, String loc) {
		this.head=head;
		this.location=loc;
		
	}
	
	public String getHead() {
		return head;
	}
	public String getLocation() {
		return location;
	}
	public void display() {
		System.out.println(this.name()+" "+this.ordinal());
	}
	
}

public class EnumDemo {

	public static void main(String[] args) {
		
    Dept d=Dept.CIVIL;
   // d.display();
    System.out.println(d.getHead());
    System.out.print(d.getLocation());

//    System.out.println(d.ordinal());
//    Dept list[]=Dept.values();
//    for(Dept x:list) {
//    	System.out.print(x+" ");
//    }
//    System.out.println(Dept.valueOf("CIVIL"));
    
	}

}
