package com.hcl.hackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.hackathon.model.Person;
import com.hcl.hackathon.repository.PersonRepository;

@RestController
@RequestMapping("person")
public class PersonController {
	@Autowired
	private PersonRepository personRepository;

	@PostMapping(path = "/add", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody Person addNewUser(@RequestBody Person person) {

		Person savedPerson = personRepository.save(person);
		return savedPerson;
	}

	@GetMapping(path = "/getAll")
	public @ResponseBody List<Person> getAllPersons() {

		List<Person> allpersons = personRepository.findAll();
		return allpersons;
	}
	
	@GetMapping(path = "/findByName")
	public @ResponseBody List<Person> getByName(@RequestParam String name) {		
		return personRepository.findByName(name);
	}
	
	@GetMapping(path = "/startsByName")
	public @ResponseBody List<Person> startsWithName(@RequestParam String name) {		
		return personRepository.findByNameStartsWith(name);
	}

}
