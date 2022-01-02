package ExceptionHandeling;
class stackoverflow extends Exception{
	

	public String toString() {
		return "Stack is Full";
	}
}
class stackundeflow extends Exception{


	public String toString() {
		return "Stack is Empty";
	}
}
class stack1{
	private int size;
	private int top=-1;
	private int s[];
	public stack1(int sz) {
		size=sz;
		s=new int [size];
		
	}
	public void push(int x) throws stackoverflow{
		if(top==size-1) 
			throw new stackoverflow();
		top++;
		s[top]=x;
		
		
	}
	public int pop() throws stackundeflow{
		int x=-1;
		if(top==-1)
		throw new stackundeflow();
		x=s[top];
		top--;
		return x;

		
	}
}
public class Stack {

	

	public static void main(String[] args)  {
		stack1 st=new stack1(5);
		try {
			st.push(10);
			st.push(15);
			st.push(10);
			st.push(15);
			st.push(10);
			st.push(15);
		}catch(stackoverflow s){
			System.out.println(s);
			
		}
//		catch(StackUndeFlow s1) {
//			System.out.println(s1);
//		}
//		

	}

}
