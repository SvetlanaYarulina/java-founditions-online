package ru.itsjava.collections.iterators;

import ru.itsjava.collections.maps.Man;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorPractice {

    public static void main(String[] args) {
        Map<Man, String> men = new HashMap<>();
        Man yarulin = new Man("Ярулин");
        Man pashov = new Man("Пашов");
        Man petrov = new Man("Петров");
        Man kolpakov = new Man("Колпаков");
        Man udin = new Man("Юдин");
        Man efremov = new Man("Eфремов");
        Man nikolaev = new Man("Николаев");
        Man permyakov = new Man("Пермяков");
        Man sobkalov = new Man("Собкалов");


        men.put(yarulin, "киви");
        men.put(pashov, "клубника");
        men.put(petrov, "персик");
        men.put(kolpakov, "апельсин");
        men.put(udin, "груша");
        men.put(permyakov, "ГруШа");
        men.put(sobkalov, "ГРуша");



        Iterator<Map.Entry<Man, String>> iterator = men.entrySet().iterator();

        while (iterator.hasNext()) { // есть ли следующий элемент
            Map.Entry<Man, String> pair = iterator.next(); // передвигаем на следующий элемент
            System.out.println(pair.getKey() + ":" + pair.getValue());


            }

            for (Man name : men.keySet())
                System.out.println("key: " + name);


        System.out.println("Условие на ключ: вернуть количество ключей" +
                " длина которых больше 5 (покупателей, чье имя больше 5");
        int keyCount = 0;
        for (Man man : men.keySet()) {
            if (man.getName().length() > 5) {
                keyCount++;
            }
        }
        System.out.println(keyCount);


        System.out.println("Вернуть количество элементов, которые равны груша");
        int count = 0;
        for (Man man : men.keySet()) {
            if (men.get(man).equals("груша")) {
                count++;
            }
        }
        System.out.println(count);

//
        System.out.println("Пропустить 1 элемент, значение которых груша, все остальные вывести");
        int grushaCount = 0;
        for (Man man : men.keySet()) {
            if ((grushaCount < 1) && men.get(man).equals("груша")) {
                grushaCount++;
            } else {
                System.out.println(men.get(man) + " ");
            }
        }


        System.out.println("Вывести все, кроме 2 элементов, ключи которых начинаются на П");
        int countKeys = 0;
        for (Man man : men.keySet()) {
            if ((countKeys < 2) && man.getName().charAt(0) == 'П') {
                countKeys++;
            } else {
                System.out.println(man.getName());
            }
        }
        System.out.println("Вернуть элемент, значение которого \"груша\", \"ГРуШа\", \"ГруШа\"");
        for (Man man : men.keySet()) {
            if (men.get(man).equals("ГРуШа")
                    || (men.get(man).equals("груша"))
                    || (men.get(man).equals("ГруШа"))) {

                System.out.println(man + " ");

            }
        }
    }
}
//

//}


// Возвращаем все элементы в другую карту, которые являются апельсин или клубника















