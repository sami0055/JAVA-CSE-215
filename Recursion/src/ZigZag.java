import java.util.*;
public class ZigZag {
	 public static void Pzz(int n) {
		 if(n==0)
			 return;
		 System.out.println("pre"+n);
		 Pzz(n-1);
		 System.out.println("In"+n);
		 Pzz(n-1);
		 System.out.println("Post"+n);
		  
	  }
public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   int n=input.nextInt();
   Pzz(n);
}
}
