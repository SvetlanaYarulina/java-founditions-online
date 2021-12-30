package ru.itsjava.interfaces;

public class Man implements Walkable, Swimable, Runnable, Flyable {

    private double maxSwimSpeed;
    private int maxRunDistance;
    private String flyMaxDistance;


    public Man(double maxSwimSpeed, int maxRunDistance, String flyMaxDistance) {
        this.maxSwimSpeed = maxSwimSpeed;
        this.maxRunDistance = maxRunDistance;
        this.flyMaxDistance = flyMaxDistance();
    }

    @Override
    public void walk() {
        System.out.println("Гуляю");

    }

    @Override
    public void swim() {
        System.out.println("Плаваю");

    }

    @Override
    public double maxSwimSpeed() {
        return 8.6;
    }

    @Override
    public void run() {
        System.out.println("Бегаю");

    }

    @Override
    public int maxRunDistance() {
        return 40;
    }

    @Override
    public void fly() {
        System.out.println("Не летаю");

    }

    @Override
    public String flyMaxDistance() {
        return ("Дистанция 8,7");
    }
}