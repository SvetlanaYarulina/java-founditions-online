package ru.itsjava.interfaces;

public class Fish implements Walkable, Swimable, Runnable, Flyable {
    private double maxSwimSpeed;
    private int maxRunDistance;
    private String flyMaxDistance;

    public Fish(double maxSwimSpeed, int maxRunDistance) {
        this.maxSwimSpeed = maxSwimSpeed;
        this.maxRunDistance = maxRunDistance;
        this.flyMaxDistance = flyMaxDistance();
    }

    @Override
    public void fly() {
        System.out.println("Рыбы не летают");
    }

    @Override
    public String flyMaxDistance() {
        return null;
    }

    @Override
    public void run() {
        System.out.println("Рыбы не бегают");
    }

    @Override
    public int maxRunDistance() {
        return 0;
    }

    @Override
    public void swim() {
        System.out.println("Рыбы плавают");

    }

    @Override
    public double maxSwimSpeed() {
        return 120;
    }

    @Override
    public void walk() {
        System.out.println("Рыбы не гуляют");

    }
}

