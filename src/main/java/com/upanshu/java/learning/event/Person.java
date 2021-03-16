package com.upanshu.java.learning.event;

import com.upanshu.java.learning.annoations.CustomerId;
import com.upanshu.java.learning.annoations.PhoneNumber;


public class Person {

    private final String name;

    @CustomerId
    private final String customerId;
    @PhoneNumber
    private final String phoneNumber;

    public Person(String name, String customerId, String phoneNumber) {
        this.name = name;
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }
}
