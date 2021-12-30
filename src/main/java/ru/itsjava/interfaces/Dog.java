package ru.itsjava.interfaces;

public class Dog implements Walkable,Swimable,Runnable, Flyable {
    private double maxSwimSpeed;
    private int maxRunDistance;
    private String flyMaxDistance;

    public Dog(double maxSwimSpeed, int maxRunDistance, String flyMaxDistance) {
        this.maxSwimSpeed = maxSwimSpeed;
        this.maxRunDistance = maxRunDistance;
        this.flyMaxDistance = flyMaxDistance();
    }


    @Override
    public void fly() {
        System.out.println("Собаки не летают");

    }

    @Override
    public String flyMaxDistance() {
        return "Дистанция 8,1";
    }

    @Override
    public void run() {
        System.out.println("Собаки бегают");

    }

    @Override
    public int maxRunDistance() {
        return 10;
    }

    @Override
    public void swim() {
        System.out.println("Собаки плавают");

    }

    @Override
    public double maxSwimSpeed() {
        return 5;
    }

    @Override
    public void walk() {
        System.out.println("Собаки гуляют");

    }
}
