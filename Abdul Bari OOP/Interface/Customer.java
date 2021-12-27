package Interface;

public class Customer implements Member{
String name;
  Customer(String name){
	  this.name=name;
  }
@Override
public void callback() {
	System.out.println("Ok,i'll visit "+name);
	
}
  
}
