package ru.itsjava.collections.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.oop.Bird;
@DisplayName("Класс Birds должен: ")
public class BirdsTest {

    public static final String DEFAULT_NAME = "Raven";

@DisplayName("корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor(){
        Bird actualBird = new Bird(DEFAULT_NAME, false);


        Assertions.assertEquals(DEFAULT_NAME, actualBird.getName());

    }

    @DisplayName("корректно изменяет Homey")
    @Test
    public void shouldHaveCorrectSetter(){
        Bird actualBird = new Bird(DEFAULT_NAME, false);
        actualBird.setHomey(true);
        Assertions.assertEquals(true, actualBird.isHomey());

    }
}
