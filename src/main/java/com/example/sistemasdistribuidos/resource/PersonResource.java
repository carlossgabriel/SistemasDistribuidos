package com.example.sistemasdistribuidos.resource;

import com.example.sistemasdistribuidos.domain.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "persons")

public class PersonResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Person>> get() {
        List<Person> persons = new ArrayList<>();

        persons.addAll(Arrays.asList(
                new Person(101, "Gabs"),
                new Person(202, "GabsGirl")
        ));

        return ResponseEntity.ok().body(persons);
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> save(@RequestBody Person person) {
        System.out.println(person);
        return ResponseEntity.noContent().build();
    }
}
