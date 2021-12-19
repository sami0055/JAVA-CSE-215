package ConditionalStatement;

public class RadixOfaNumber {

	public static void main(String[] args) {
	
		String num="01101010";
		if(num.matches("[0-1]+"))
		{
			System.out.println("Binary");
		}
		else
			System.out.println("Not binary number");
        
		String num2="1234567";
		if(num2.matches("[0-7]+"))
		{
			System.out.println("Octal number");
		}
		else
		{
			System.out.println("Not a octal number");
		}
		String num3="A25B";
		
		if(num3.matches("[0-9A-F]+"))
		System.out.println("Hexa");
		else
		{
			System.out.println("Not hexa");
		}
	}

}
