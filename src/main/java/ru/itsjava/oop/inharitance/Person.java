package ru.itsjava.oop.inharitance;


import lombok.Data;
import lombok.Setter;

@Setter

@Data
public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void birthday() {
         age ++;
        System.out.println("age = " + age);
    }

    public boolean takeBeer() {
        return age >= 18;
    }
}
