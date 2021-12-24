package Metdods;

public class MethodPractice {
   static void change(int A[],int index,int value) {
	   A[index]=value;
   }
   
   static void change2(int x,int value) {
	   x=value;
   }
	public static void main(String[] args) {
	
		int a[]= {2,3,4,5,6,8};
		change(a,2,99);
		for(int x:a) {
			System.out.print(x+" ");
			
		}
		int y=10;
		change2(y,20);
		System.out.println(y);

	}

}
