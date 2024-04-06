package coms.RestApiWithDataJpa.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.RestApiWithDataJpa.entities.Person;



@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

}
