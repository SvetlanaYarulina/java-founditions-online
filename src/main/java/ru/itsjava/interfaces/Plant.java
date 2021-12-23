package ru.itsjava.interfaces;

public class Plant implements Talkable, Eatable{
    @Override
    public void eat() {
        System.out.println("Растение пьет воду");;
    }

    @Override
    public void talk() {
        System.out.println(" Растение не разговаривает");
    }
}


