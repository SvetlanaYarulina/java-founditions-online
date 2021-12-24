package ru.itsjava.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
@Data
@AllArgsConstructor
public class Main{
    private String name;
    String age;
    String surname;

    public static void main(String[] args) {

        Person person1 = new Person("Светлана", "Ярулина", 35);
        Person person2 = new Person("Кира", "Ярулина", 11);
        Person person3 = new Person("Татьяна", "Пепеляева", 20);

        Person[] persons = {person1, person2, person3};
        System.out.println("Arrays.toString(persons) = " + Arrays.toString(persons));
        Arrays.sort(persons);    //сортировка по возрасту
        System.out.println("Arrays.toString(persons) = " + Arrays.toString(persons));



    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {

        return "Person{" + name + ", " + surname + " ," + age + "}";
    }

}
