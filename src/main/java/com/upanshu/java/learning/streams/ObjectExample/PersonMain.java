package com.upanshu.java.learning.streams.ObjectExample;

import java.util.*;
import java.util.stream.Collectors;

public class PersonMain {

    private static List<Person> getPeople() {
         return Arrays.asList(new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE));
    }

    public static void main(String[] args) {
        List<Person> people = getPeople();

        //filter
        people.stream()
                .filter(person -> person
                        .getGender()
                        .equals(Gender.FEMALE))
                .forEach(System.out::println);

        //sorted
        people.stream()
                .sorted(Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getGender)
                        .reversed())
                .forEach(System.out::println);

        //allMatch
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge()>50);
        System.out.println(allMatch);

        //anyMatch
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge()> 15);
        System.out.println(anyMatch);

        //noMatch
        boolean noMatch = people.stream()
                .noneMatch(person -> person.getName().equals("upanshu"));
        System.out.println(noMatch);

        //Max
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        //min
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        //group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            System.out.println(people1);
        });

        //multiple operations
        people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .ifPresent(System.out::println);

     //   people.stream().map(person -> person.getAge() *2).forEach(System.out::println);
    }
}
