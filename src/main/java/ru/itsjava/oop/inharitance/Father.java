package ru.itsjava.oop.inharitance;

public interface Father{


    default void giveLove() {
        System.out.println("Father loves you");
    }
}


