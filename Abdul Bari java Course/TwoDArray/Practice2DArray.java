package TwoDArray;

public class Practice2DArray {

	public static void main(String[] args) {
		int A[][]=new int [5][5];
		int B[][]= {{1,2,4,5},{2,3,4,5},{5,7,8,9}};
		int c[][];
		c=new int [5][5];
		int []D[]=new int [5][5];
		int [] E, F[];
		E=new int [5];
		 F=new int [5][5];
       for(int i=0; i<B.length; i++) {
    	   for(int j=0; j<B[0].length; j++) {
    		   System.out.print(B[i][j]);
    	   }
    	   System.out.println();
       }
       //for each loop
       for(int x[]:B) {
    	   for(int y:x) {
    		   System.out.print(y);
    	   }
    	   System.out.println();
       }
       //jagged array
       int a[][];
        a=new int [3][];
       a[0]=new int [5];
       a[1]=new int [3];
       a[2]=new int [8];
       for(int i=0; i<a.length; i++) {
    	   for(int j=0; j<a[i].length; j++) {
    		   System.out.print(a[i][j]+" ");
    	   }
    	   System.out.println();
       }
       
	}

}
