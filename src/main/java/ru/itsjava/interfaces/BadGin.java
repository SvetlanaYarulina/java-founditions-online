package ru.itsjava.interfaces;

public class BadGin implements Creatable{


    @Override
    public void creatWish() {
        System.out.println("Плохо исполнил желание");
    }


    @Override
    public void canYouCreatWish() {
        System.out.println("Я не исполняю твоих желаний");
    }

    @Override
    public void canYouCreateWish() {

    }
}
