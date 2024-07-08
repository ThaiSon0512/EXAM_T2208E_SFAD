package com.sun.enterprise.repository;

import com.sun.enterprise.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}