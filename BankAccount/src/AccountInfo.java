
public class AccountInfo {
   String Name;
   int AccountNum;
   double Balance;
   public AccountInfo() {
	   this.Name="Not updated";
	   this.AccountNum=0;
	   this.Balance=0;
	   
   }
   public AccountInfo(String Name,int AccountNum,double Balance) {
	   this.Name=Name;
       this.AccountNum=AccountNum;
	   this.Balance=Balance;
	 
   }
   public void Information() {
	   System.out.println("User Name: "+this.Name);
	   System.out.println("Accont Numbe "+AccountNum);
	   System.out.println("Your Current Balance is : "+Balance);
	   
   }
}
