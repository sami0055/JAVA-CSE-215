package SingletonClass;

 class CoffeMachine {
    private float coffeeQty;
    private float waterQty;
    private float milkQty;
    private float sugarQty;
    static private CoffeMachine my=null;
    
   private CoffeMachine(){
    	coffeeQty=1;
    	waterQty=1;
    	milkQty=1;
    	sugarQty=1;
    }
   public void fillWater(float qty) {
	   waterQty=qty;
   }
   public void fillSugar(float qty) {
	   sugarQty=qty;
   }
   public float getCoffee() {
	   return 0.23f;
   }
   
   static public CoffeMachine getInstatnce() {
	   if(my==null) {
		   my=new CoffeMachine();
	   }
	   return my;
   }
}
