package JavaLangPackage;

import java.awt.SystemColor;

class MyObject{
	public String toString() {
		return "My Object";
	}
	public int hashCode() {
		return 100;
	}
	
}
class MyObject2 extends  MyObject{
	//it's indirectly inharite object class
}
public class ObjectClass {

	public static void main(String[] args) {
      Object o1=new Object();
      Object o2=new Object();
      System.out.println(o1);
      System.out.println(o1.equals(o2));
      System.out.println(o1.hashCode());
      MyObject o3=new MyObject();
      System.out.println(o3.toString());
      System.out.println(o3.hashCode());
      
	}

}
