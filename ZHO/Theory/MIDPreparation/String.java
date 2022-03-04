package MIDPreparation;

public class String {

	public static void main(java.lang.String[] args) {
		java.lang.String s="Samiul;Alim-Sami";
		java.lang.String middlename=s.substring(s.indexOf(";")+1,s.indexOf("-"));
		System.out.println(middlename);

	}

	
}
