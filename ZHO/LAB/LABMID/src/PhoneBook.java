
public class PhoneBook {

	private Contact[] contacts;
	private int numOfContacts;
	
	PhoneBook(int size)
	{
		this.numOfContacts=0;
		contacts=new Contact[size];
	}
	public boolean addContact(Contact contact)
	{
		if(numOfContacts<contacts.length)
		{
			contacts[numOfContacts++]=contact;
             return true;
		}
		return false;
	}
	public int getSize()
	{
		return numOfContacts;
		
	}
	public void viewAllContacts()
	{
		for(int i=0; i<numOfContacts; i++)
		{
			System.out.println(contacts[i]);
		}
	}
	public void ViewEmergencyContacts()
	{
		for(int i=0; i<numOfContacts; i++)
		{
			if(contacts[i].isEmergencyContact())
			{
				System.out.println(contacts[i]);
			}
		}
	}
	public String searchContact(String name)
	{
		for(int i=0; i<numOfContacts; i++)
		{
			if(contacts[i].getName().equals(name))
			{
				return contacts[i].getPhone();
			}
		}
		return null;
		
	}
	public void delete(String name)
	{
		for(int i=0; i<numOfContacts; i++)
		{
			if(contacts[i].getName().equals(name))
			{
				for(int j=i; j<numOfContacts-1; j++)
				{
					contacts[j]=contacts[j+1];
				}
				numOfContacts--;
				break;
			}
			
		}
	}
	public void deleteAll()
	{
		numOfContacts=0;
		contacts =new Contact[contacts.length];
		
	}
	public boolean isEmpty()
	{
		return numOfContacts==0;
	}
	public boolean isFull()
	{
		return numOfContacts==contacts.length;
	}
	
}
