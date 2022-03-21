package ru.itsjava.oop.inharitance;

public class Films {
    private final String name; // название фильма
    private final int year; // год создания
    private final int budget; // бюджет фильма в млн долларов

    public Films(String name, int year, int budget) {
        this.name = name;
        this.year = year;
        this.budget = budget;
    }

    public String toString() {
        return "{ name:" + name + " year:" + year + " budget:" + budget + "}";
    }

}

