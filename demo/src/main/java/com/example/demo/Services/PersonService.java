package com.example.demo.Services;

import com.example.demo.Repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    // methods to create: create, readbyid, readall, update, deletebyid

    private PersonRepository personRepository;
@Autowired
    public PersonService ( PersonRepository personRepository){
this.personRepository = personRepository;
    }
}
