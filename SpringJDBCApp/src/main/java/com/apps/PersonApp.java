package com.apps;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Person;
import com.service.PersonService;
import java.util.List;


public class PersonApp {

	public static void main(String[] args) {
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("jdbcConfig.xml");
		PersonService ps=(PersonService)factory.getBean("JdbcObj");//interface injection
		
		Person prsn=null;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Add Person\n2.View All\n3.Search Person\n4.Update Person\n5.Delete Person\n6.Exit\n");
			System.out.println("Pick ur choice");
			int ch=sc.nextInt();
;
			switch(ch)
			{
			case 1:
				 prsn=new Person();
				System.out.println("person name:" );
				prsn.setPersonName(sc.next());
				
				System.out.println("person email:" );
				prsn.setEmail(sc.next());
				
				System.out.println("person phone:" );
				prsn.setPhone(sc.next());
				
				String result=ps.AddNewPerson(prsn);
				
				if(result.equals("success"))
					System.out.println("person added.......");
				else
					System.out.println("person not added.......");
				break;
			
			case 2:
				
				List<Person> personList = ps.ShowAll();
				if(personList.isEmpty())
					System.out.println("No Person Details are exist");
				else
				{
					for(Person p : personList)
					{
						System.out.println(p.getPerid() + "\t" + p.getPersonName() + "\t" + p.getEmail() + "\t" + p.getPhone());
					}
				}
				break;
			case 4:
				System.out.println("Enter person id");
				int perid=sc.nextInt();
				
				prsn=ps.SearchPerson(perid);
				
				if(prsn!=null)
					System.out.println("Present name of Person" + prsn.getPersonName() );
					System.out.println("Enter new name of person");
					prsn.setPersonName(sc.next());
					String res=ps.ModifyPerson(prsn);
					if(res.equals("success"))
						System.out.println("Modified");
				else
					System.out.println("Not Modified");
				break;
			case 3:
				System.out.println("Enter person id");
				perid=sc.nextInt();
				
				prsn=ps.SearchPerson(perid);
				
				if(prsn!=null)
					System.out.println(prsn.getPerid() + "\t" + prsn.getPersonName() + "\t" + prsn.getEmail() + "\t" + prsn.getPhone());
				else
					System.out.println("Not found");
				break;
				
			case 5:
				System.out.println("Enter person id");
				 perid=sc.nextInt();
				
				if(prsn!=null)
				{
					System.out.println("Do you want to delete?");
					String dch=(sc.next());
					if(dch.equalsIgnoreCase("Y"))
					{
						ps.DeletePerson(perid);
						System.out.println("Person deleted....");
					}
				} 
				else
					System.out.println("Person not found");
				break;
				
			case 6:
				System.out.println("Thanks ...:)");
				System.exit(0);
		
		
	}
	}
	}
}