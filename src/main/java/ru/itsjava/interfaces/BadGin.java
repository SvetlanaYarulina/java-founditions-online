package ru.itsjava.interfaces;

public class BadGin implements Creatable{


    @Override
    public void creatWish() {
        System.out.println("Плохо исполнил желание");
    }
}
