package ru.itsjava.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>,Cloneable {
    private final String surname;
    private final String name;
    private double age;



    @Override
    public int compareTo(Person anotherPerson) {
        int result = this.getSurname().compareTo(anotherPerson.getSurname());
        //используем метод compareTo из класса String для сравнения фамилии
        if (result == 0) {
            result = this.getName().compareTo(anotherPerson.getName());

    }
        if (result == 0) return (int) (age - anotherPerson.age);
        return result;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return "Person{" + name + ", " + surname + " ," + age + "}";
    }

}
