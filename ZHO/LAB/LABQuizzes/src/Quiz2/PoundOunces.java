package Quiz2;

public class PoundOunces {
	private int pounds;
	private int ounces;
	
	public PoundOunces (int pounds, int ounces) {
		this.pounds = pounds;
		this.ounces = ounces;
	}
	
	public void getPounds (int pounds) {
		this.pounds = pounds;
	}
	
	public void getOunces (int ounces) {
		this.ounces = ounces;
	}
	
	public int getPounds () {
		return pounds;
	}
	
	public int getOunces () {
		return ounces;
	}
	
	@Override
	public String toString () {
		int total  = this.pounds * 16 + this.ounces;
		int pound = total / 16;
		int ounce = total % 16;
		return "Pound --> " + pound + " Ounce --> " + ounce;
	}
	
	public int toComapre (PoundOunces comp) {
		int thisPoundsOunces = this.pounds * 16 + this.ounces;
		int compPoundsOunces = comp.pounds * 16 + comp.ounces;
		
		if (thisPoundsOunces > compPoundsOunces) {
			return 1;
		} else if (thisPoundsOunces == compPoundsOunces) {
			return 0;
		} else {
			return -1;
		}
	}
	
	public PoundOunces add (PoundOunces given) {
		int checkP = this.pounds + given.pounds;
		int checkO = this.ounces + given.ounces;
		PoundOunces rtrn = new PoundOunces (checkP, checkO);
		return rtrn;
	}
	
	
}
