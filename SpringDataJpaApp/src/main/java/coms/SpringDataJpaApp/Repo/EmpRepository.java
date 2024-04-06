package coms.SpringDataJpaApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.SpringDataJpaApp.entities.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Integer> {

	
}
