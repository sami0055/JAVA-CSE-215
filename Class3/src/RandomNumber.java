import java.util.*;
public class RandomNumber {
public static void main(String[] args) {
	//Random number
	//formula
	//(lower -uppper+1)+upper
	int lower=1;
	int upper=6;
	//int rnum=(int)(Math.random()*(upper-lower+1)+lower);
	int rnum=(int)(Math.random()*6);// 0 include
	System.out.println(rnum);
}
}
