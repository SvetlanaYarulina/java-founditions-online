package ru.itsjava.collections.maps;


import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Man, String> men = new HashMap<>();
        Man ivanov = new Man("Иванов");
        Man sidorov = new Man("Сидоров");
        Man javov = new Man("Джавов");

        men.put(ivanov, "футболка");
        men.put(sidorov, "свитшот");
        men.put(javov, "свитер");

        for (Map.Entry<Man, String> pair : men.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        System.out.println("------------");
        for (Man keyMan : men.keySet()) {
            System.out.println(keyMan + ":" + men.get(keyMan));
        }

        System.out.println("men.remove(ivanov) = " + men.remove(ivanov));

        System.out.println("After delete Ivanov");
        for (Man keyMan : men.keySet()) {
            System.out.println(keyMan + ":" + men.get(keyMan));
        }

        System.out.println("men.size() = " + men.size());
        System.out.println("men.isEmpty() = " + men.isEmpty());

        System.out.println("men.replace(javov, \"свитер\", \"перчатки\") = " + men.replace(javov, "свитер", "перчатки"));
        System.out.println(men.get(javov));

        men.clear();

        System.out.println("men.size() = " + men.size());



        Map<Man, String> man = new HashMap<>();
        Man yarulin = new Man("Ярулин");
        Man pashov = new Man("Пашов");
        Man petrov = new Man("Петров");
        Man kolpakov = new Man("Колпаков");
        Man udin = new Man("Юдин");

        man.put(yarulin, "банан");
        man.put(pashov, "клубника");
        man.put(petrov, "персик");
        man.put(kolpakov, "апельсин");
        man.put(udin, "груша");


        System.out.println("------------");

        System.out.println("man.get(kolpakov) = " + man.get(kolpakov)); // получить фрукт по покупателю

        System.out.println("man.remove(\"груша\") = " + man.remove("груша")); // удалить фрукт

        //Проверить на наличие ключ и значение
        System.out.println("man.containsKey(pashov) = " + man.containsKey(pashov));
        System.out.println("man.containsValue(\"клубника\") = " + man.containsValue("клубника"));

        // Вывести все ключи
        System.out.println("Вывести все ключи - всех покупателей");
        for (Man keyMan : man.keySet()) {
            System.out.println(keyMan);

        }

        // Выведем все ключи и значения с помощью entrySet()
        System.out.println("Вывести все ключи и значения");
        for (Map.Entry<Man, String> pair : man.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        //В новый экземпляр HashMap добавим старую карту???


    }
}





