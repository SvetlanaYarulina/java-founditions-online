package ru.itsjava.collections;

import java.util.Arrays;
import java.util.List;

public class PersonPractice {
    public static void main(String[] args) {
        Person p1 = new Person("Svetlana", 35, false);
        Person p2 = new Person("Henry", 25, true);
        Person p3 = new Person("Kira", 11, false);
        Person p4 = new Person("Holy", 17, false);
        Person p5 = new Person("Natali", 56, false);
        Person p6 = new Person("Igor", 25, true);
        Person p7 = new Person("Hanna", 20, false);
        Person p8 = new Person("Maxim", 18, true);


        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
        System.out.println(persons);

        //Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на 'Н'
        for (Person elemPerson : persons) {
            if ((elemPerson.getName().charAt(0) == 'H')
                    && (elemPerson.getAge() < 27)
                    && (elemPerson.getAge() > 18)
                    && (elemPerson.isMale())) {

                System.out.println(elemPerson + " ");
            }

        }

        System.out.println("Найти средний возраст всех женщин");

        double sumAge = 0;
        int countFemale = 0; // количество женщин
        for (Person elemPerson : persons) {
            if (!elemPerson.isMale()) {
                countFemale++;
                sumAge += elemPerson.getAge();
            }
        }
        double averageAge = sumAge / countFemale;
        System.out.println(averageAge);
    }
}






