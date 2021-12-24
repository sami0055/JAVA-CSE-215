package Metdods;

public class FindMaxVariableArgument {
  static int max(int ...A) {
	  if(A.length==0)
		  return Integer.MIN_VALUE;
	  
	  int m=A[0];
	  for(int i=0; i<A.length; i++) {
		  if(A[i]>m) {
			  m=A[i];
		  }
	  }
	  return m;
  }
	public static void main(String[] args) {
	  
		
		int m=max(3,4,5,6,6);
        System.out.println("Max is "+m);
	}

}
