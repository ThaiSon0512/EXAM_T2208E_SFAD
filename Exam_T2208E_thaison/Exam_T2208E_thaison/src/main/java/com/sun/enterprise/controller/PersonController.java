package com.sun.enterprise.controller;

import com.sun.enterprise.model.Person;
import com.sun.enterprise.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Persons")
public class PersonController {

    @Autowired
    private PersonService PersonService;

    @PostMapping("/create")
    public Person createPerson(@RequestBody Person Person) {
        return PersonService.createPerson(Person);
    }

    @GetMapping("/all")
    public List<Person> findAllPersons() {
        return PersonService.findAllPersons();
    }
}
