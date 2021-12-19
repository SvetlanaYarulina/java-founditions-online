package ru.itsjava.interfaces;

public class Bird implements Walkable, Swimable, Runnable, Flyable {
    private double maxSwimSpeed;
    private int maxRunDistance;
    private String flyMaxDistance;

    public Bird(double maxSwimSpeed, int maxRunDistance) {
        this.maxSwimSpeed = maxSwimSpeed;
        this.maxRunDistance = maxRunDistance;
        this.flyMaxDistance = flyMaxDistance();
    }

    @Override
    public void fly() {
        System.out.println("Птицы летают");
    }

    @Override
    public String flyMaxDistance() {
        return null;
    }

    @Override
    public void run() {
        System.out.println("Птицы не бегают");

    }

    @Override
    public int maxRunDistance() {
        return 0;
    }

    @Override
    public void swim() {
        System.out.println("Птицы плавают");

    }

    @Override
    public double maxSwimSpeed() {
        return 20;
    }

    @Override
    public void walk() {
        System.out.println("Птицы гуляют");

    }
}
