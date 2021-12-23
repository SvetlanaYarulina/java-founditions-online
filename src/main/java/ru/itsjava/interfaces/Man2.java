package ru.itsjava.interfaces;

public class Man2 implements Talkable, Eatable{
    @Override
    public void eat() {
        System.out.println("Человек ест растения, воду, молоко");;
    }

    @Override
    public void talk() {
        System.out.println("Человек разговаривает");
    }
}
