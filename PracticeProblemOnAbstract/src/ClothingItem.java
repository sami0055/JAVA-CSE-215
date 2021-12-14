
public class ClothingItem extends Product{
  private String fabricType;
    ClothingItem(){
    	
    }
    ClothingItem(String name,double price,String fabricType){
    	super(name,price);
    	this.fabricType=fabricType;
    }

	public String getFabricType() {
		return fabricType;
	}

	public void setFabricType(String fabricType) {
		this.fabricType = fabricType;
	}

	@Override
	public void  changePrice(double percentage) {
	    setPrice(getPrice()-getPrice()*(percentage/100));
		
		
	}
	

	@Override
	public String toString() {
		
		return super.toString()+" FabricType: "+this.getFabricType()+" Change Price: ";
	}
	
}
