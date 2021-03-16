package com.upanshu.java.learning.controller;

import com.upanshu.java.learning.event.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("person")
public class ValidationController {

    private static final Logger logger = LoggerFactory.getLogger(ValidationController.class);

    @PostMapping
    public Person create(@Valid @RequestBody Person person) {
        logger.info("Received valid customerId {} and phone number {} ", person.getCustomerId(), person.getPhoneNumber());
        return person;
    }
}
