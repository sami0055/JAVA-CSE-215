package SCI03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SCI03 {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Customer list[]= {new Customer("Samiul alim","43435456y46"),
				new Customer("Jhon","3423-34045"),new Customer("Sami","33455")};
       FileOutputStream fos=new FileOutputStream("Customer.txt");
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       oos.writeInt(list.length);

       for(Customer c:list) {
    	   oos.writeObject(c);
       }
       oos.close();
       fos.close();
       
       FileInputStream fis=new FileInputStream("Customer.txt");
       ObjectInputStream ois=new ObjectInputStream(fis);
       int length=ois.readInt();
       for(int i=0; i<length; i++) {
    	   list[i]=(Customer) ois.readObject();
       }
       System.out.println("Enter Name of Customer: ");
       String name=sc.nextLine();
       for(int i=0; i<length; i++) {
    	   if(name.equalsIgnoreCase(list[i].name)) {
    		   System.out.println(list[i]);
    	   }
       }
       ois.close();
       fis.close();
	}

}
