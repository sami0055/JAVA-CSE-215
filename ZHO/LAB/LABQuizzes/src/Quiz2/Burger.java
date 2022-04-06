package Quiz2;

public class Burger {
	private String size;
	private int slices;
	private int no_of_patties;
	private int no_of_pastrami;
	public Burger(String size, int slices, int no_of_patties, int no_of_pastrami) {
		
		this.size = size;
		this.slices = slices;
		this.no_of_patties = no_of_patties;
		this.no_of_pastrami = no_of_pastrami;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getSlices() {
		return slices;
	}
	public void setSlices(int slices) {
		this.slices = slices;
	}
	public int getNo_of_patties() {
		return no_of_patties;
	}
	public void setNo_of_patties(int no_of_patties) {
		this.no_of_patties = no_of_patties;
	}
	public int getNo_of_pastrami() {
		return no_of_pastrami;
	}
	public void setNo_of_pastrami(int no_of_pastrami) {
		this.no_of_pastrami = no_of_pastrami;
	}
	public double calcCost()
	{
		double bun=0,res;
        if(size.equalsIgnoreCase("Small"))
        bun=3.0;
        if(size.equalsIgnoreCase("Medium"))
        bun=4.0;
        if(size.equalsIgnoreCase("Large"))
        bun=5.0;
        res=bun+(2*slices)+(3*no_of_pastrami)+(10*no_of_patties);
        return res;
	}
	@Override
	public String toString() {
		return "Burger [size=" + size + ", slices=" + slices + ", no_of_patties=" + no_of_patties + ", no_of_pastrami="
				+ no_of_pastrami + "Cost"+this.calcCost();
	}
	
	
	
	

}
