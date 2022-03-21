package ru.itsjava.object;

import ru.itsjava.oop.inharitance.Bird;

public class ObjectPractice {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();  // CTRL+D

        System.out.println(obj1 == obj2);

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        obj1 = obj2;

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));


        Dog kate = new Dog("Кати", 4);
        Dog kate2 = new Dog("Кати", 4);

        Dog murka = new Dog("Мурка", 4);

        System.out.println("kate.equals(kate2) = " + kate.equals(kate2));
        System.out.println("kate.equals(murka) = " + kate.equals(murka));

        Bird parrot = new Bird("Попугай", true);
        Bird parrot2 = new Bird("Попугай", true);

        Bird raven = new Bird("Ворона", false);

        System.out.println("parrot.equals(raven) = " + parrot.equals(raven));
        System.out.println("parrot.equals(parrot2) = " + parrot.equals(parrot2));

        System.out.println("kate.toString() = " + kate.toString());
        //  System.out.println("kate.toString() = " + kate); можно записывать так


        System.out.println("kate.getNickname() = " + kate.getNickname());

        System.out.println("parrot2.toString() = " + parrot2.toString());

        System.out.println("parrot2.getName() = " + parrot2.getName());

        System.out.println("parrot.hashCode() = " + parrot.hashCode());

        System.out.println("parrot.getName() = " + parrot.getName());

        System.out.println("raven.toString() = " + raven.toString());

        System.out.println("raven.hashCode() = " + raven.hashCode());

        System.out.println("raven.getName() = " + raven.getName());




    }
}
