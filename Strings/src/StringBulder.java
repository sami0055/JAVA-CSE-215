import java.util.*;
public class StringBulder {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("Tony");
	System.out.println(sb);
	//char at index
   System.out.println(sb.charAt(0));
   //set char at index
   sb.setCharAt(0, 'p');
   System.out.println(sb);
   //insert char
   sb.insert(2, 'n');
   System.out.println(sb);
   //delete the extra n
   sb.delete(2, 3);
   System.out.println(sb);
   sb.append("et");
   sb.append("e");
   System.out.println(sb);
   
}
}
