package BankAccount;

import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private double annualInteresteRate;
	
	public Account()
	{
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated=new Date();
	}

	public Account(int id, double balance) {

		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDate()
	{
		return dateCreated;
	}
	
	public double getMonthlyIntereste()
	{
		return balance*(annualInteresteRate/1200.0);
	}
	public double getMonthlyInteresteRate()
	{
		return annualInteresteRate/12;
	}
			
	public void withDraw(double amount)
	{
		balance-=amount;
	}
	public void deposite(double amount)
	{
		balance+=amount;
	}
}
