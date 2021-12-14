
public class ElectronicDevice extends Product{
    private String model;
    private String warranty;
    public ElectronicDevice() {
    	
    }
    public ElectronicDevice(String name, double price, String model, String warranty) {
		super(name, price);
		this.model = model;
		this.warranty = warranty;
	}
    
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	@Override
	public void changePrice(double percentage) {
	
		setPrice(this.getPrice()+this.getPrice()*(percentage/100));
		
	}
	
  
	@Override
	public String toString() {
		
		return super.toString()+" Model: "+this.getModel()+" Warranty: "+this.getWarranty();
	}

	

}
