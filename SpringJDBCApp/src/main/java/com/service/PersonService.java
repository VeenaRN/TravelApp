package com.service;

import java.util.*;

import com.beans.Person;

public interface PersonService {
	
	public String AddNewPerson(Person person);
	
	public List<Person> ShowAll();
	
	public Person SearchPerson(int perid);
	
	public String ModifyPerson(Person person);
	
	public String DeletePerson(int perid);
	
	
}
