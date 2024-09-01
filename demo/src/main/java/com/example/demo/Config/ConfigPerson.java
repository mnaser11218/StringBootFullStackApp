package com.example.demo.Config;

import com.example.demo.Repositories.PersonRepository;
import com.example.demo.models.Person;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigPerson {
    @Autowired
    PersonRepository personRepository;
    @PostConstruct
    public void createPersons(){
        Person person1 = new Person(1L, "NASER", "EOM");
        Person person2 = new Person(2L, "RESAN", "NISSAN");
        personRepository.save(person1);
        personRepository.save(person2);

    }
}
