package com.example.demo.Services;

import com.example.demo.Repositories.PersonRepository;
import com.example.demo.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    // methods to create: create, readbyid, readall, update, deletebyid

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person create(Person personToCreate){
       return personRepository.save(personToCreate);
    }
    public Person readById(Long id){
        return personRepository.findById(id).get();
    }
    public List<Person> readAll(){
        Iterable<Person> allRecords = personRepository.findAll();
        List<Person> allPersons = new ArrayList<>();
        allRecords.forEach(allPersons::add);
        return allPersons;
    }

    public Person update(Long id, Person newPerson){
    Person person = personRepository.findById(id).get();
    person.setId(id);
    person.setFirstName(newPerson.getFirstName());
    person.setLastName(newPerson.getLastName());
    personRepository.save(person);
    return person;
    }

    public Person deleteById(Long id){
        Person person = this.readById(id);
         personRepository.deleteById(id);
         return person;
    }

}
