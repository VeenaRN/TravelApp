package coms.RestApiWithDataJpa.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import coms.RestApiWithDataJpa.Repo.PersonRepo;
import coms.RestApiWithDataJpa.entities.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepo  pr;
	
	@Override
	public String AddPerson(Person prsn) {
		Person p = pr.save(prsn);
		if(p!=null)
			return "Success";
		return "Err";
	}

	@Override
	public List<Person> ViewAll() {
		return pr.findAll();
	}

	@Override
	public Person SearchPerson(int prnid) {
		Optional<Person>  person = pr.findById(prnid);
		
		if(person.isPresent())
			return person.get();
		
		return null;
	}

	@Override
	public String UpdatePerson(Person prsn) {
		Person p = pr.saveAndFlush(prsn);
		
		if(p!=null)
			return "Success";
		return "Err";
	}

	@Override
	public void DeletePerson(int prnid) {
		pr.deleteById(prnid);
	}

	@Override
	public Person SearchPersonByPhone(String ph) {
		Person person = null;
		List<Person>  perlist = pr.findAll();
		for(Person p : perlist)
		{
			if(p.getPhone().equals(ph))
			{
				person = p;
				break;
			}
		}
		return person;
	}

}

