package Lec03;

public class ForEachLoopExample {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int x:nums) {
			sum+=x;
		}
		System.out.println(sum);
		
		for(int x:nums) {
			System.out.print(x+" ");
			x=x*10;//no effect on nums
			System.out.println(x);
		}

	}

}
