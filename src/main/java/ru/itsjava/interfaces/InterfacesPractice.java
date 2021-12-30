package ru.itsjava.interfaces;

public class InterfacesPractice {
    public static void main(String[] args) {
        Creatable khotabich = new Gin(); // ссылка типа интерфейса
        khotabich.creatWish();
        Creatable badGin = new BadGin();
        badGin.creatWish();


        Man man = new Man(8.6, 40, "8,7");
        man.walk();
        man.swim();
        System.out.println("Максимальная скорость плавания: " + man.maxSwimSpeed());
        man.run();
        System.out.println("Максимальная дистанция бега: " + man.maxRunDistance());
        man.fly();
        System.out.println("Максимальная дистанция полета: " + man.flyMaxDistance());

        Dog dog = new Dog(5, 10,"8.1");
        dog.walk();
        dog.swim();
        System.out.println("Максимальная скорость плавания: " + dog.maxSwimSpeed());
        dog.run();
        System.out.println("Максимальная дистанция бега: " + dog.maxRunDistance());
        dog.fly();
        System.out.println("Максимальная дистанция полета: " + dog.flyMaxDistance());

        Cat cat = new Cat(48,10, "3.0");
        cat.walk();
        cat.swim();
        System.out.println("Максимальная скорость плавания: " + cat.maxSwimSpeed());
        cat.run();
        System.out.println("Максимальная дистанция бега: " + cat.maxRunDistance());
        cat.fly();
        System.out.println("Максимальная дистанция полета: " + cat.flyMaxDistance());

        Bird bird = new Bird(20, 0, "10.1");
        bird.walk();
        bird.swim();
        System.out.println("Максимальная скорость плавания: " + bird.maxSwimSpeed());
        bird.run();
        System.out.println("Максимальная дистанция бега: " + bird.maxRunDistance());
        bird.fly();
        System.out.println("Максимальная дистанция полета: " + bird.flyMaxDistance());

        Fish fish = new Fish(120,0, "0");
        fish.walk();
       fish.swim();
        System.out.println("Максимальная скорость плавания: " + fish.maxSwimSpeed());
        fish.run();
        System.out.println("Максимальная дистанция бега: " + fish.maxRunDistance());
        fish.fly();
        System.out.println("Максимальная дистанция полета: " + fish.flyMaxDistance());

        khotabich.canYouCreatWish();
        badGin.canYouCreatWish();







    }
}




