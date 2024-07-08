package com.sun.enterprise.service;

import com.sun.enterprise.model.Person;
import com.sun.enterprise.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository PersonRepository;

    public Person createPerson(Person Person) {
        return PersonRepository.save(Person);
    }

    public List<Person> findAllPersons() {
        return PersonRepository.findAll();
    }
}
