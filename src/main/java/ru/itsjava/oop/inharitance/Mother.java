package ru.itsjava.oop.inharitance;

public interface Mother {

    default void giveLove() {
        System.out.println("Mother loves you");;
    }
}


