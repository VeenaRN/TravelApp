package com.collections.assignment;
import java.util.*;

public class PhoneBook {
	
	private List<Contact> phonelist=new ArrayList<Contact>();

	public List<Contact> getPhonelist() {
		return phonelist;
	}

	public void setPhonelist(List<Contact> phonelist) {
		this.phonelist = phonelist;
	}
	
	public void addContact(Contact contactObj) {
		phonelist.add(contactObj);
	}
	public List<Contact> viewAllContact() 
	{
		return this.getPhonelist();
	}
	public Contact viewContactGivenPhone(long phoneNumber)
	{
		Contact contact=null;
		for(Contact c:phonelist)
		{
			if(c.getPhonenumber()==phoneNumber)
			{
				contact=c;
				break;
			}
		}
		return contact;
		
	
	}
	
	public boolean removeContact(long phoneNumber)
	{
		boolean c_chk=false;
		for(Contact c:phonelist)
		{
			if(c.getPhonenumber()==phoneNumber)
			{
				phonelist.remove(c);
				c_chk=true;
				
				break;
			}
			
	}
		return c_chk;

	}
	
	public void sortContactsByFirstName() {
		Collections.sort(phonelist,new Comparator<Contact>(){
			public int compare(Contact c1,Contact c2) {
				return c1.getFirstname().compareTo(c2.getFirstname());
			}
		});
	}
}