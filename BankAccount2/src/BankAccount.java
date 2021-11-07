
public class BankAccount {
  private String name;
 
private int Accn;
  private int PIN;
  private double balance;
  BankAccount(){
	  
  }
  BankAccount(String name,int Accn,int PIN,double balance){
	  this.name=name;
	  this.Accn=Accn;
	  this.PIN=PIN;
	  this.balance=balance;
	  
  }
  public void getInfo() {
	  System.out.println("Name: "+this.name);
	  System.out.println("Accn: "+Accn);
	  System.out.println("PIN: "+PIN);
	  System.out.println("Balance: "+this.balance);
	
	  
  }
  public void setName(String name) {
	  this.name=name;
  }
  public void setPIN(int PIN) {
	  this.PIN=PIN;
	  
  }
  public void setAccn(int Accn) {
	  this.Accn=Accn;
  }
  public void setBalance(int balance) {
	  this.balance=balance;
  }
  public String getName() {
	  return name;
  }
  public int getAccn() {
	  return Accn;
  }
  public int getPIN() {
	  return PIN;
  }
  public double getBalance() {
	  return balance;
  }
  //Constructor overloading
  /**
 * @param name
 * @param Accn
 * @param PIN
 */
BankAccount(String name,int Accn,int PIN){
	  this.name=name;
	  this.Accn=Accn;
	  this.PIN=PIN;
  }
}
