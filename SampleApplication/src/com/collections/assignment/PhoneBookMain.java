package com.collections.assignment;

import java.util.List;
import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Contact contact=null;
		PhoneBook pb=new PhoneBook();
		while(true)
		{
			System.out.println("1.Add contact\n 2.View All Contact\n3.Search Contatc\n4.Remove Contact\n5.Exit\n6.Sortbased on first name\n");
			System.out.println("Pick your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				contact=new Contact(null,null,0,null);
				System.out.println("First name");
				contact.setFirstname(sc.next());
				System.out.println("Last name");
				contact.setLastname(sc.next());
				System.out.println("Phone Number");
				contact.setPhonenumber(sc.nextLong());
				System.out.println("Email Id");
				contact.setEmailId(sc.next());
				pb.addContact(contact);
				System.out.println("contact added");
				break;
			
			case 2:
				List<Contact> cntall=pb.viewAllContact();
				for (Contact c:cntall)
				{
				System.out.println(c.getFirstname()+"\t"+c.getLastname()+"\t"+c.getPhonenumber()+"\t"+c.getEmailId());	
				
				}
				break;
			case 3:
				System.out.println("enter phone number to search");
				long ph=sc.nextLong();
				contact =pb.viewContactGivenPhone(ph);
				if(contact!=null)
					System.out.println(contact.getFirstname()+contact.getLastname()+contact.getPhonenumber()+contact.getEmailId());
				else
					System.out.println("contact not found");
			case 4:
				System.out.println("enter phone number to remove");
				 ph=sc.nextLong();
				 boolean chkr=pb.removeContact(ph);
				 if(chkr==true)
					 System.out.println("removed");
				 else
					 System.out.println("not found");
				 break;
				
			case 5:
				System.out.println("Thanks");
				System.exit(0);
			case 6:
				pb.sortContactsByFirstName();
				List<Contact> all=pb.viewAllContact();
				for(Contact c:all) {
					System.out.println(c.getFirstname()+"\t"+c.getLastname()+"\t"+c.getEmailId()+"\t"+c.getPhonenumber());
				}
				break;
				}
			}
		}

	}


