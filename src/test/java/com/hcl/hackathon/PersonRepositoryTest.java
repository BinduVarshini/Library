package com.hcl.hackathon;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.hcl.hackathon.model.Person;
import com.hcl.hackathon.repository.PersonRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application.properties")
public class PersonRepositoryTest {
	@Autowired
    private MockMvc mvc;

    @Autowired
    private PersonRepository repository;
    
    
    @Test
    public void testSavePerson() {
    	Person p = new Person("Sam", "M", LocalDate.of(1990, 01, 01));
    	Person p1 = repository.save(p);
    	Assert.assertNotNull(p1.getId());
    	Assert.assertEquals(p1.getName(), repository.findById(p1.getId()).get().getName());
    }
}