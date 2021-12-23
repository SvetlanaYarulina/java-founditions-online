package ru.itsjava.interfaces;

public interface Creatable {

    void creatWish();

    default void canYouCreatWish() {
        System.out.println("Я могу выполнить твое желание");
    }

    void canYouCreateWish();
}

