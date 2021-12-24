package ru.itsjava.strings;

import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {
//        String name = "Svetlana";
//        String copyName = "Svetlana"; // ctrl + D
//
//        //проверим ссылаются ли на одну и туже ссылку
//        System.out.println("(name == copyName) = " + (name == copyName));
//
//        String constructorName = new String("Svetlana"); // разные ссылки
//        System.out.println("(constructorName == name) = " + (constructorName == name));
//        String interConstructorName = constructorName.intern();
//        System.out.println("(interConstructorName == name) = " + (interConstructorName == name));


        String str = "Я строка";
        System.out.println("str.length() = " + str.length()); // длина строки
        System.out.println("str.isEmpty() = " + str.isEmpty());// пустая или нет
        System.out.println("str.equals(\"Я строкА\") = " + str.equals("Я строкА")); // сравниваем содержимое строк
        System.out.println("str.equals(\"Я строкА\") = " + str.equalsIgnoreCase("Я строкА"));
        String[] strs = str.split(" "); // разбивка строки
        System.out.println(strs[0]);
        System.out.println (strs[1]);

//        for (int i = 0; i < 10000000; i ++) {
//            str = str + "!"; //создаем новые объекты

            StringBuilder builderStr = new StringBuilder(str); // меняем состояние одного объекта любое количество раз
            for (int i = 0; i < 100; i ++) {
                builderStr.append("!");
                System.out.println(builderStr.toString());

                String str2 = "НоВая"; // объединение строк
                System.out.println("str.concat(str2) = " + str.concat(str2));
                System.out.println("Новая" + str);
                System.out.println("str.trim() = " + str.trim()); // возвращает копию строки с пропущенными
                // начальными и конечными пробелами

                System.out.println("str.toLowerCase(Locale.ROOT) = " + str.toLowerCase(Locale.ROOT));
                // преобразует все символы в нижний регистр

                System.out.println("str2.toUpperCase() = " + str2.toUpperCase());
                // преобразует все символы в верхний регистр
                System.out.println("str.hashCode() = " + str.hashCode()); // возвращает хэш-код для строки
                System.out.println("str.getBytes() = " + str.getBytes()); // кодирует строку в последовательность байтов

                System.out.println("str2.charAt() = " + str2.charAt(3));
                // возвращает символ из массива строки по указ. индексу

                System.out.println("str.compareTo(str2) = " + str.compareTo(str2));// сравниваем 2 строки
            }
    }


}
