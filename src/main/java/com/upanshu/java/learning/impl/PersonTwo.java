package com.upanshu.java.learning.impl;

import com.upanshu.java.learning.interfaceImpl.Person;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!demo")
public class PersonTwo implements Person {

    @Override
    public void printInformation() {
        System.out.println("printed in main profile");
    }

}
