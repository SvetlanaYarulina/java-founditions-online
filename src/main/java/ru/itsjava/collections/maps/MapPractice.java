package ru.itsjava.collections.maps;


import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
//        Map<Man, String> men = new HashMap<>();
//        Man ivanov = new Man("Иванов");
//        Man sidorov = new Man("Сидоров");
//        Man javov = new Man("Джавов");
//
//        men.put(ivanov, "футболка");
//        men.put(sidorov, "свитшот");
//        men.put(javov, "свитер");
//
//        for (Map.Entry<Man, String> pair : men.entrySet()) {
//            System.out.println(pair.getKey() + ": " + pair.getValue());
//        }
//
//        System.out.println("------------");
//        for (Man keyMan : men.keySet()) {
//            System.out.println(keyMan + ":" + men.get(keyMan));
//        }
//
//        System.out.println("men.remove(ivanov) = " + men.remove(ivanov));
//
//        System.out.println("After delete Ivanov");
//        for (Man keyMan : men.keySet()) {
//            System.out.println(keyMan + ":" + men.get(keyMan));
//        }
//
//        System.out.println("men.size() = " + men.size());
//        System.out.println("men.isEmpty() = " + men.isEmpty());
//
//        System.out.println("men.replace(javov, \"свитер\", \"перчатки\") = " + men.replace(javov, "свитер", "перчатки"));
//        System.out.println(men.get(javov));
//
//        men.clear();
//
//        System.out.println("men.size() = " + men.size());


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


        Map<Man, Fruit> fruitMap = new HashMap<>();
        fruitMap.put(yarulin, new Fruit("киви", 25));
        fruitMap.put(pashov, new Fruit("клубника", 48));
        fruitMap.put(petrov, new Fruit("персик", 48));
        fruitMap.put(kolpakov, new Fruit("апельсин", 120));
        fruitMap.put(udin, new Fruit("груша", 78));
        fruitMap.put(permyakov, new Fruit("Груша", 78));
        fruitMap.put(sobkalov, new Fruit("ГРуша", 78));


        System.out.println("------------");


        System.out.println("В новый экземпляр HashMap добавим старую карту");
        Map<Man, Fruit> fruitMap2 = new HashMap<>();
        fruitMap2.putAll(fruitMap);


        System.out.println("fruitMap2.get(kolpakov) = " + fruitMap2.get(kolpakov)); // получить фрукт по покупателю

        System.out.println("fruitMap2.remove(\"груша\") = " + fruitMap2.remove("груша")); // удалить фрукт

        //Проверить на наличие ключ и значение
        System.out.println("fruitMap2.containsKey(pashov) = " + fruitMap2.containsKey(pashov));
        System.out.println("fruitMap2.containsValue(\"клубника\") = " + fruitMap2.containsValue("клубника"));

        // Вывести все ключи
        System.out.println("Вывести все ключи - всех покупателей");
        for (Man keyMan : fruitMap2.keySet()) {
            System.out.println(keyMan);
        }

        System.out.println("Найти средний вес всех фруктов");
        double sumWeight = 0;
        int countFruit = 0;
        for (Man man : fruitMap2.keySet()) {
            countFruit++;
            sumWeight += fruitMap2.get(man).getWeight();
        }
        double averageWeight = sumWeight / countFruit;
        System.out.println(averageWeight);


        System.out.println("Пропустить 1 элемент, значение которых груша, все остальные вывести");
        int grushaCount = 0;
        for (Man man : fruitMap2.keySet()) {
            if ((grushaCount < 1) && fruitMap2.get(man).getName().equals("груша")) {
                grushaCount++;
            } else {
                System.out.println(fruitMap2.get(man) + " ");
            }
        }
    }
}



// Выведем все ключи и значения с помощью entrySet()
//        System.out.println("Вывести все ключи и значения");
//        for (Map.Entry<Man, String> pair : fruitMap2.entrySet()) {
//            System.out.println(pair.getKey() + ": " + pair.getValue());
//        }








