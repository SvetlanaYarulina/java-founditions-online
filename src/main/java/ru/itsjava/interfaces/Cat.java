package ru.itsjava.interfaces;

public class Cat implements Walkable, Swimable, Runnable, Flyable{
    private double maxSwimSpeed;
    private int maxRunDistance;
    private String flyMaxDistance;

    public Cat(double maxSwimSpeed, int maxRunDistance,String flyMaxDistance){
        this.maxSwimSpeed = maxSwimSpeed;
        this.maxRunDistance = maxRunDistance;
        this.flyMaxDistance = flyMaxDistance();
    }


    @Override
    public void fly() {
        System.out.println("Кошки не летают");

    }

    @Override
    public String flyMaxDistance() {
        return "Дистанция 3,0";
    }

    @Override
    public void run() {
        System.out.println("Кошки бегают");

    }

    @Override
    public int maxRunDistance() {
        return 10;
    }

    @Override
    public void swim() {
        System.out.println("Кошки плавают");

    }

    @Override
    public double maxSwimSpeed() {
        return 5;
    }

    @Override
    public void walk() {
        System.out.println("Кошки гуляют");

    }
}
