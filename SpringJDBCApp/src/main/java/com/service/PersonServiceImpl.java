package com.service;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.beans.Person;

public class PersonServiceImpl implements PersonService {
	
	 private JdbcTemplate jdbcTemp;//used to interact with db

	public JdbcTemplate getJdbcTemp() {
		return jdbcTemp;
	}

	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;//jdbctemplate bean has been injected to personservimpl through setter injection
	}

	@Override
	public String AddNewPerson(Person person) {
		String sqlcmd="Insert into Person(personName,email,phone)values(?,?,?)";
		int res=jdbcTemp.update(sqlcmd,new Object[] {person.getPersonName(),person.getEmail(),person.getPhone()});
		//to execute insert,update,delete .update is used
		if(res>=1)
		return "success";	
		return "err";
		
	}

	@Override
	public List<Person> ShowAll() {
		String sqlcmd="Select *from Person";
		
		List<Person> allpersons=jdbcTemp.query(sqlcmd, new BeanPropertyRowMapper(Person.class));//converts select(resultset) statement query into list type
		// TO execute retrive data we have to use .query
		return allpersons;
	}

	@Override
	public Person SearchPerson(int perid) {
		String sqlcmd="Select *from person where perid=?";
		Person perObj=null;
		try
		{
		perObj = (Person) jdbcTemp.queryForObject(sqlcmd, new Object[] {perid},new BeanPropertyRowMapper(Person.class));
		
	}
		catch(Exception ex)
		{
			perObj=null;
		}
		return perObj;
	}

	@Override
	public String ModifyPerson(Person person) {
		String sqlcmd="Update Person set personName=? where perid=?";
		int res=jdbcTemp.update(sqlcmd,new Object[] {person.getPersonName(),person.getPerid()});
		if(res>=1)
			return"success";
		return"error";
	}

	@Override
	public String DeletePerson(int perid) {
		String sqlcmd="Delete from Person where perid=?";
		int res=jdbcTemp.update(sqlcmd,new Object[] {perid});
		if(res>=1)
			return"Deleted Successfully";
		return"err";
	}	

}
