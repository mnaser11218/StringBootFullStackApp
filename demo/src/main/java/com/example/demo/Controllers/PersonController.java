package com.example.demo.Controllers;

import com.example.demo.Services.PersonService;
import com.example.demo.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/person-controller")
public class PersonController {

    private final PersonService personService;

    public PersonController (@Autowired PersonService personService){
        this.personService = personService;
    }
    // create, readbyid, readall, update, delete
    @RequestMapping(path="/create", method= RequestMethod.POST)
    public ResponseEntity<Person>create(@RequestBody Person person){
    final Person requestBody = personService.create(person);
    final ResponseEntity<Person>responseEntity = new ResponseEntity<>(requestBody, HttpStatus.CREATED);
    return responseEntity;
    }
    @RequestMapping(path="/read/{id}", method=RequestMethod.GET)
    public ResponseEntity<Person>readById(@PathVariable Long id){
       final Person requestBody= personService.readById(id);
        final ResponseEntity<Person>responseEntity = new ResponseEntity<>(requestBody, HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping(path="/readall", method=RequestMethod.GET)
    public ResponseEntity<List<Person>> readAll(){
       final List<Person>peopleList = personService.readAll();
       final ResponseEntity<List<Person>> responseEntity = new ResponseEntity<>(peopleList, HttpStatus.OK);
       return responseEntity;
    }

    @RequestMapping(path="/update/{id}", method=RequestMethod.PUT)
    public ResponseEntity<Person> update(@RequestBody Person person, @PathVariable Long id){
        final Person p = personService.update(id, person);
        final ResponseEntity<Person> responseEntity = new ResponseEntity<>(p, HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping(path="/delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Person> delete(@PathVariable Long id){
        final Person responseBody = personService.deleteById(id);
        final ResponseEntity<Person> responseEntity = new ResponseEntity<>(responseBody, HttpStatus.OK);
        return responseEntity;
    }
}
