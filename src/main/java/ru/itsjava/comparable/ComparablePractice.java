package ru.itsjava.comparable;

import java.util.Arrays;

public class ComparablePractice {
    public static void main(String[] args) {
        Boy vitalik = new Boy("vitalik",15, 165);
        Boy vasya = new Boy("vasya", 14,160);
        Boy vanya = new Boy("vanya",18,188);

        System.out.println("vitalik.compareTo(vasya) = " + vitalik.compareTo(vasya));
        System.out.println("vasya.compareTo(vanya) = " + vasya.compareTo(vanya));

        Boy[] boys = {vitalik,vasya,vanya};
        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));
        Arrays.sort(boys);    //сортировка по росту
        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));



        Person person1 = new Person("Светлана", "Ярулина", 35);
        Person person2 = new Person("Кира", "Ярулина", 11);

        System.out.println("person1.compareTo(person2) = " + person1.compareTo(person2));
    }
}
