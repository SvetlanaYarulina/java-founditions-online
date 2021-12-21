package ru.itsjava.oop;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Person должен:")
public class PersonTest {


    public static final String DEFAULT_NAME = "Svetlana";
    public static final int DEFAULT_AGE = 35;
    public static final String NEW_NAME = "Kira";
    public static final int NEW_AGE = 19;

    @DisplayName("корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);


//        Assertions.assertEquals(DEFAULT_NAME, actualPerson.getName());
//        Assertions.assertEquals(DEFAULT_AGE, actualPerson.getAge());

        Assertions.assertAll("actualPerson", () -> assertEquals(DEFAULT_NAME, actualPerson.getName()),
                () -> assertEquals(DEFAULT_AGE,actualPerson.getAge()));

    }

    @DisplayName("Корректно меняет имя")
    @Test
    public void shouldHaveCorrectSetterName() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

        actualPerson.setName(NEW_NAME);
        Assertions.assertEquals(NEW_NAME, actualPerson.getName());
    }

    @DisplayName("Корректно меняет возраст")
    @Test
    public void shouldHaveCorrectSetterAge() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

        actualPerson.setAge(NEW_AGE);
        Assertions.assertEquals(NEW_AGE, actualPerson.getAge());
    }

    @DisplayName("Проверять возраст")
    @Test
    public void shouldHaveCorrectAddYear() {
        Person actualPerson = new Person(DEFAULT_NAME, NEW_AGE);
        actualPerson.birthday();

    }
    @DisplayName("Проверять можно ли продавать пиво")
    @Test
    public void shouldHaveCorrectTakeBeer() {
        Person actualPerson = new Person(DEFAULT_NAME, NEW_AGE);
        Assertions.assertTrue(actualPerson.takeBeer());

    }


}









