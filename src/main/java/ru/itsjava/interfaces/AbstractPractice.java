package ru.itsjava.interfaces;

public class AbstractPractice {
    public static void main(String[] args) {

        Car bmw = new Bmw();
        bmw.getCarMake();

        Cow burenka = new Cow();
        burenka.eat();
        burenka.talk();
        Plant tree = new Plant();
        tree.eat();
        tree.talk();
        Man2 sveta = new Man2();
        sveta.eat();
        sveta.talk();

    }
}
