package ru.itsjava.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public int setAge(int age) throws AgeNotValidException {
        if (age > 0 & age < 150) {
            return age;
        }
        throw new AgeNotValidException("Возраст не корректен");
    }
}

