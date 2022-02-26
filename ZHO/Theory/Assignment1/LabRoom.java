package Assignment1;

public class LabRoom {

	private int Chair;
	private int Table;
	private int Computers;
	
	public LabRoom(int chair, int table, int computers) {
		
		Chair = chair;
		Table = table;
		Computers = computers;
	}
	public LabRoom()
	{
		Chair=0;
		Table=0;
		Computers=0;
	}
	
	
	public int getChair() {
		return Chair;
	}
	public void setChair(int chair) {
		Chair = chair;
	}
	public int getTable() {
		return Table;
	}
	public void setTable(int table) {
		Table = table;
	}
	public int getComputers() {
		return Computers;
	}
	
	
	public void setComputers(int computers) {
		Computers = computers;
	}
	public void addChairs(int number)
	{
		this.Chair+=number;
	}
	public void removeChairs(int number)
	{
		this.Chair-=number;
	}
	public void addTable(int number)
	{
		this.Table=number;
	}
	public void removeTable(int number)
	{
		this.Table-=number;
	}
	public void addComputers(int number)
	{
		this.Computers+=number;
	}
	public void removeComputers(int number)
	{
		this.Computers-=number;
	}
	
	
	
}
