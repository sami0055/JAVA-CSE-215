import java.util.*;
public class Quiz {
	
	
   
	public static void main(String[] args) {
		
	  Scanner sc=new Scanner(System.in);

	int score=0;
	boolean t=true;
	while(t) {
		int num1=(int) (Math.random()*100);
		int num2=(int)(Math.random()*100);
		if(num1<num2) {
			int temp=num1;
			num1=num2;
			num2=temp;
		}
		System.out.println("What is "+num1+"-"+num2);
		int ans=sc.nextInt();
		if(ans==num1-num2){
			System.out.println("Correct");
			score++;
			
		}
		else {
			System.out.println("you are worng");
			t=false;
		}
	}
	System.out.println("Your score is "+score);

}
}


