package ru.itsjava.cloneable;

import ru.itsjava.comparable.Person;

public class CloneablePractice {
    public static void main(String[] args) throws CloneNotSupportedException {
        Girl dasha = new Girl("dasha", 160);

        Girl dasha2 = (Girl) dasha.clone();
        System.out.println("dasha2 = " + dasha2);
        System.out.println("dasha = " + dasha);

        Person person = new Person("Виктория", "Рыжова", 21);
        Person person4 = (Person) person.clone();
        System.out.println("person4 = " + person4);
        System.out.println("person = " + person);

//        Person person1 = new Person("Светлана", "Ярулина", 35);
//        Person person2 = new Person("Кира", "Ярулина", 11);
//        Person person2 = (Person) person.clone();
//        System.out.println("person2 = " + person2);
    }

}
