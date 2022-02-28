package ru.itsjava.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice3 {
    public static void main(String[] args) {

        java.util.List<Book> booksList = new ArrayList<>();

        System.out.println("Создать список, размером 20");
        java.util.List<Book> booksList1 = new ArrayList<>(20);

        Book book1 = new Book("Гарри Поттер", "Роуллинг", 235);
        Book book2 = new Book("Зеленая миля", "Кинг", 448);
        Book book3 = new Book("Унесённые_ветром", "Митчел", 640);
        Book book4 = new Book("Крёстный отец", "Пьюзо", 544);
        Book book5 = new Book("Мастер_и_Маргарита", "Булгаков", 512);
        Book book6 = new Book("Семь_сестёр", "Райли_Люсинда", 704);
        Book book7 = new Book("Алхимик", "Коэльо", 224);
        Book book8 = new Book("Белый_клык", "Лондон", 208);
        Book book9 = new Book("Маленький_принц", "Экзюпери", 128);
        Book book10 = new Book("Гордость_и_предубеждение", "Остин", 480);
        Book book11 = new Book("Таинственный_остров", "Жуль_Верн", 576);
        Book book12 = new Book("Бегущий_за_ветром", "Хоссейни", 416);
        Book book13 = new Book("Поющие_в_терновнике", "Маккалоу", 640);
        Book book14 = new Book("Война_и_мир", "Толстой", 920);
        Book book15 = new Book("Денискины_рассказы", "Драгунский", 176);
        Book book16 = new Book("Джейн_Эйр", "Бронте", 512);
        Book book17 = new Book("Суьба_человека", "Шолохов", 288);
        Book book18 = new Book("Зулейха_открывает_глаза", "Яхина", 512);
        Book book19 = new Book("Мемуары_гейши", "Голден", 512);


        booksList1.add(book1);
        booksList1.add(book2);
        booksList1.add(book3);
        booksList1.add(book4);
        booksList1.add(book5);
        booksList1.add(book6);
        booksList1.add(book7);
        booksList1.add(book8);
        booksList1.add(book9);
        booksList1.add(book10);
        booksList1.add(book11);
        booksList1.add(book12);
        booksList1.add(book13);
        booksList1.add(book14);
        booksList1.add(book15);
        booksList1.add(book16);
        booksList1.add(book17);
        booksList1.add(book18);
        booksList1.add(book19);

        for (Book elemBook : booksList1) {
            System.out.println(elemBook);
        }

        System.out.println(booksList1);

        System.out.print("List: ");
        for (Book elemBook : booksList1) {
            System.out.print(elemBook + " ");
        }
        System.out.println();


        //Добавить подряд 5 элементов
        System.out.println("Добавить подряд 5 элементов");
        Book book20 = new Book("Красная_шапочка", "Перро", 16);
        Book book21 = new Book("Золотой_ключик", "Толстой", 120);
        Book book22 = new Book("Идиот", "Достоевский", 640);
        Book book23 = new Book("2666", "Боланьо", 212);
        Book book24 = new Book("Девушка_с_татуировкой_дракона", "Ларссон", 32);
        booksList1.add(book20);
        booksList1.add(book21);
        booksList1.add(book22);
        booksList1.add(book23);
        booksList1.add(book24);
        for (Book elemBook : booksList1) {
            System.out.println(elemBook);
        }
        System.out.println(booksList1);


        // Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
        System.out.println("Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию");
        booksList1.add(2, book6);
        booksList1.add(0, book7);
        System.out.println(booksList1);


        //Записать в новый список все элементы предыдущего списка
        System.out.println("Записать в новый список все элементы предыдущего списка.");
        List<Book> booksList2 = new ArrayList<>();
        booksList2.addAll(booksList1);
        System.out.println(booksList2);


        //а). Получить первый элемент по индексу(первую книгу в списке)
        System.out.println("Получить первый элемент по индексу(первую книгу в списке)");
        System.out.println("booksList1.get(0) = " + booksList1.get(0));
        System.out.println();
        //б). Получить последний элемент (последнюю книгу в списке)
        System.out.println("Получить последнюю книгу в списке");
        System.out.println("booksList1.get(booksList1.size() - 1) = " + booksList1.get(booksList1.size() - 1));


        //Удалить элемент по книге
        System.out.println("Удалить элемент по книге");
        booksList1.remove("Идиот");
        System.out.println(booksList1);


        //Удалить элемент по индексу
        System.out.println("Удалить элемент по индексу");
        booksList1.remove(2);
        System.out.println(booksList1);


        // Проверить наличие элемента
        System.out.println("Проверить наличие элемента");
        System.out.println("booksList1.contains(book6) = " + booksList1.contains(book6));
        System.out.println("booksList2.contains(\"2666\") = " + booksList2.contains("2666"));


        // хаотично в список добавить 4 книги с названием "Java"
        System.out.println("Хаотично в список добавить 4 книги с названием \"Java\"");
        Book book = new Book("Java", "Эккель", 1168);
        booksList2.add(book);
        booksList2.add(book);
        booksList2.add(book);
        booksList2.add(book);


        // Отфильтровать список вернуть записи по некоторому условию: Индекс делится на 3
        System.out.println("Индекс делится на 3");
        for (int i = 0; i < booksList2.size(); i++) {
            if (i % 3 == 0) {
                System.out.println(booksList2.get(i));
            }
        }


        //  Вернуть количество книг, которые равны "Java"
        System.out.println("Вернуть количество книг, которые равны Джава");
        int count = 0;
        for (int i = 0; i < booksList2.size(); i++)
            if (booksList2.get(i).getName().equals("Java")) {
                count++;
            }
        System.out.println(count);



        //Пропустить первые 3 книги в списке
        System.out.println("Пропустить первые 3 книги в списке");
        int bookCount = 0;
        for (int i = 0; i < booksList2.size(); i++) {
            if ((bookCount < 3) && booksList2.get(i).equals(i)) {
                bookCount++;
            } else {
                System.out.println(booksList2.get(i) + "");
            }
        }


        // Пропустить первые 2 книги, которые равные "Java"
        System.out.println("Пропустить первые 2 книги, которые равные \"Java\"");
        int javaCount = 0;
        for (int i = 0; i < booksList2.size(); i++) {
            if ((javaCount < 2) && booksList2.get(i).getName().equals("Java")) {
                javaCount++;
            } else {
                System.out.println(booksList2.get(i) + "");
            }
        }



        //Возвращаем первую книгу, длина автора которого делится на 3
        System.out.println("Возвращаем первую книгу, длина автора которого делится на 3");
        for (int i = 0; i < booksList2.size(); i++) {
            if (booksList2.get(i).getAuthor().length() % 3 == 0) {
                System.out.println(booksList2.get(i) + " ");
                break;
            }
        }
        System.out.println();


        //Возвращаем все книги, длина автора которых делится на 3.
        System.out.println("Возвращаем все книги, длина автора которых делится на 3.");
        for (int i = 0; i < booksList2.size(); i++) {
            if (booksList2.get(i).getAuthor().length() % 3 == 0) {
                System.out.println(booksList2.get(i) + " ");
            }
        }


        //Вывести список на экран в формате: List: [ Book{"7 навыков высокоэффективных людей", "Кови", 387};
        //Book{"Java. Эффективное программирование", "Блох Дж.", 219};]
        System.out.println("Вывести список на экран в формате: List: [ Book{\"7 навыков высокоэффективных людей\", \"Кови\", 387};\n" +
                "            //Book{\"Java. Эффективное программирование\", \"Блох Дж.\", 219};]");
        System.out.print("List: " + "[");
        for (Book elemBook : booksList2) {
            System.out.print(elemBook + ";");
        }
    }
}











