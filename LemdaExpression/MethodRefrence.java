package LemdaExpression;

interface Lambda1{
	public void display(String str);
}
public class MethodRefrence {
     public static void reverse(String str) {
    	 StringBuffer sb=new StringBuffer(str);
    	 sb.reverse();
    	 System.out.println(sb);
    	 }
	public static void main(String[] args) {
	
		Lambda1 lm=MethodRefrence::reverse;
		lm.display("Hello");

	}

}
