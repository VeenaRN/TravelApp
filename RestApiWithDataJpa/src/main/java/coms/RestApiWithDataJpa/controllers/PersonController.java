package coms.RestApiWithDataJpa.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coms.RestApiWithDataJpa.Service.PersonService;
import coms.RestApiWithDataJpa.entities.Person;

@RestController
@RequestMapping("/api/person/v1")
public class PersonController {

	@Autowired
	PersonService  ps;
	
	@PostMapping("person")
	public ResponseEntity<Object> AddNewPerson(@RequestBody Person prn)
	{
		String res = ps.AddPerson(prn);
		if(res.equals("Success"))
			return new ResponseEntity<Object>("New Person Added...", HttpStatus.CREATED);
		
		return new ResponseEntity<Object>("New Person Not Added...", HttpStatus.OK);
	}
	
	@GetMapping("person")
	public ResponseEntity<List<Person>> GetAllPersons()
	{
		List<Person>  perlist = ps.ViewAll();
		
		if(perlist.isEmpty())
			return new ResponseEntity("No person Info exist", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Person>>(perlist, HttpStatus.OK);
	}
	
	@GetMapping("person/{prnid}")
	public ResponseEntity<Person> SearchPerson(@PathVariable int prnid)
	{
		Person person = ps.SearchPerson(prnid);
		
		if(person!=null)
			return new ResponseEntity<Person>(person, HttpStatus.OK);
		
		return new ResponseEntity("Person Not Found...", HttpStatus.NOT_FOUND);
	}

	@GetMapping("person/{ph}/{pno}")
	public ResponseEntity<Person> SearchPersonByPhone(@PathVariable String ph, @PathVariable int pno)
	{
		Person person = ps.SearchPersonByPhone(ph);
		
		if(person!=null)
			return new ResponseEntity<Person>(person, HttpStatus.OK);
		
		return new ResponseEntity("Person Not Found With given phone number...", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("person/{prnid}")
	public ResponseEntity<Object> DeletePerson(@PathVariable int prnid)
	{
		ps.DeletePerson(prnid);
		
		return new ResponseEntity<Object>("Person Deleted", HttpStatus.OK);
	}
	
	@PutMapping("person/{prnid}")
	public ResponseEntity<Object> ModifyPerson(@PathVariable int prnid, @RequestBody Person prn)
	{
		String res = ps.UpdatePerson(prn);
		if(res.equals("Success"))
			return new ResponseEntity<Object>("Person Modified", HttpStatus.OK);
		
		return new ResponseEntity<Object>("Person Not Found", HttpStatus.NOT_FOUND);
	}
}

