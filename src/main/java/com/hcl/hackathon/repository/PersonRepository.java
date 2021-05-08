package com.hcl.hackathon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hcl.hackathon.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	
	public List<Person> findByName(String name);
	
	@Query("from Person where name like :name%")
	public List<Person> findByNameStartsWith(@Param("name") String name);

}
