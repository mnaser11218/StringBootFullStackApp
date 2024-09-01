package com.example.demo.Controllers;

import com.example.demo.Services.PersonService;
import com.example.demo.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/person-controller")
public class PersonController {

    private final PersonService personService;

    public PersonController (@Autowired PersonService personService){
        this.personService = personService;
    }
    @RequestMapping(path="/create", method= RequestMethod.POST)
    public ResponseEntity<Person>create(@RequestBody Person person){
    Person requestBody = personService.create(person);
    ResponseEntity<Person>responseEntity = new ResponseEntity<>(requestBody, HttpStatus.CREATED);
    return responseEntity;
    }
}
