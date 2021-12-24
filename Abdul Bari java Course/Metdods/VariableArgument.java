package Metdods;

public class VariableArgument {
     static void show(int ...A) {
    	 for(int a:A) {
    		 System.out.print(a);
    	 }
    	 System.out.println();
     }
     static void show(String ...S) {
    	 for(int i=0; i<S.length; i++) {
    		 System.out.println(i+1+"."+S[i]);
    	 }
     }
	public static void main(String[] args) {
		show(2,3,4,5,6,6);
        show(new int [] {2,5,5,6,7});
        show("Samiul","ALim","Mitu","Chowdhury");
	}

}
