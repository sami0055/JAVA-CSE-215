package Lecture9;

public class RefPassDriver {

	public static void main(String[] args) {
		
		RefPass ob=new RefPass(15,20);
		System.out.println("ob.a and ob.b before call:  "+ob.a+" "+ob.b);
		ob.meth(ob);
		System.out.println("ob.a and ob.b after call: "+ob.a+" "+ob.b);
		
	}

}
