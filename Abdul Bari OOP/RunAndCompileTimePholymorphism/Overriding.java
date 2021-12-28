package RunAndCompileTimePholymorphism;
class Super{
	public void display() {
		System.out.println("Super display");
	}
	
}
class Sub extends Super{
	public void display() {
		System.out.println("Sub display");
	}
}
public class Overriding {

	public static void main(String[] args) {
		//Method overloading is a run time Polymorphism
		Super s=new Sub();
		s.display();//Overrided method will be called
        
	}

}
