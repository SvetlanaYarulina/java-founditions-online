package ru.itsjava.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Man andrey = new Man("Andrey");
        Man maxim = new Man("Maxim");
        Man vitya = new Man("Vitya");

        Set<Man> manSet = new HashSet<>(Arrays.asList(andrey, maxim, vitya)); // можно передать любую коллекцию
        System.out.println("manSet = " + manSet);

        System.out.println("manSet.add(andrey) = " + manSet.add(andrey)); // добавили андрея, получим false
        System.out.println("manSet = " + manSet);

        Man andrey2 = new Man("Andrey");

        System.out.println("manSet.add(andrey2) = " + manSet.add(andrey2)); // добавили андрей2, получим false,
        // т.к. проверка по equals
        System.out.println("manSet.contains(andrey) = " + manSet.contains(andrey));

        System.out.println("manSet.isEmpty() = " + manSet.isEmpty());
        System.out.println("manSet.remove(andrey2) = " + manSet.remove(andrey2));
        System.out.println("manSet = " + manSet);

        System.out.println("manSet.remove(andrey2) = " + manSet.remove(andrey2));
        System.out.println("manSet = " + manSet);

        System.out.println("manSet.size() = " + manSet.size());

        Fruit banana = new Fruit("Banana", 100);
        Fruit pear = new Fruit("Pear", 150);
        Fruit orange = new Fruit("Orange", 210);
        Fruit peach = new Fruit("Peach", 83);

        Set<Fruit> fruitSet = new HashSet<>(Arrays.asList(banana, pear, orange, peach));
        System.out.println("fruitSet = " + fruitSet);

        Fruit strawberry = new Fruit("strawberry", 20);
        System.out.println("fruitSet.add(strawberry) = " + fruitSet.add(strawberry));
        System.out.println("fruitSet = " + fruitSet);

        System.out.println("fruitSet.add(strawberry) = " + fruitSet.add(strawberry));
        System.out.println("fruitSet = " + fruitSet);

        System.out.println("fruitSet.remove(pear) = " + fruitSet.remove(pear));
        System.out.println("fruitSet = " + fruitSet);

        System.out.println("fruitSet.contains(orange) = " + fruitSet.contains(orange));
        System.out.println("fruitSet = " + fruitSet);
    }


}

