package ExceptionHandeling;
class NegativeDimensionException extends Exception{
	public String toString()
	{
		return "Dimension of a rectangle can't be negative";
	}
}
public class UsetDefineException {
       static int area(int l,int b) throws NegativeDimensionException {
    	   if(l<0||b<0)
    	   throw new NegativeDimensionException();
    	   return l*b;
       }
       static void meth1() throws NegativeDimensionException {
    	   System.out.println(area(-5,6));
       }
	public static void main(String[] args) {
		
		
		
		try {
			meth1();
		} catch (NegativeDimensionException e) {
			
			System.out.println(e);
		}

	}

}
