package com.hcl.hackathon.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.hcl.hackathon.LocalDateDeserializer;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty
	private Integer id;
	@JsonProperty
	private String name;
	@JsonProperty
	private String sex;
	
	@JsonDeserialize(using=LocalDateDeserializer.class)
	private LocalDate dob;
	
	
	
	
	public Person() {
		super();
	}

	public Person(Integer id, String name, String sex, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.dob = dob;
	}

	public Person(String name, String sex, LocalDate dob) {
		super();
		this.name = name;
		this.sex = sex;
		this.dob = dob;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
}
