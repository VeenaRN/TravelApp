package coms.RestApiWithDataJpa.Service;



import java.util.List;

import coms.RestApiWithDataJpa.entities.Person;

public interface PersonService 
{
	public String AddPerson(Person prsn);
	public List<Person> ViewAll();
	public Person SearchPerson(int prnid);
	public String UpdatePerson(Person prsn);
	public void DeletePerson(int prnid);
	public Person SearchPersonByPhone(String ph);
}


