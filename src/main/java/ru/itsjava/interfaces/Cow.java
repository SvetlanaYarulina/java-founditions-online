package ru.itsjava.interfaces;

public class Cow implements Talkable,Eatable {
    @Override
    public void talk() {
        System.out.println("Корова говорит My");
    }

    @Override
    public void eat() {
        System.out.println("Корова ест сено");;

    }
}
