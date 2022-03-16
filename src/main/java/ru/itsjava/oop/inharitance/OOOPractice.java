package ru.itsjava.oop.inharitance;

public class OOOPractice {
    public static void main(String[] args) {
        Telephone phone = new Iphone();

        System.out.println("phone.toString() = " + phone.toString());

        Telephone phone2 = new Iphone();
        System.out.println("phone2.toString() = " + phone2.toString());

        Bird bird = new Parrots();

        System.out.println("bird.toString() = " + bird.toString());

        Bird bird2 = new Ravens();
        System.out.println("bird2.toString() = " + bird2.toString());

        Films film = new Comedy();
        System.out.println("film.toString() = " + film.toString());

        Films film2 = new Thriller();
        System.out.println("film2.toString() = " + film2.toString());

        Films film3 = new Drama();
        System.out.println("film3.toString() = " + film3.toString());


    }
}
