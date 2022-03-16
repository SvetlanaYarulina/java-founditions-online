package ru.itsjava.iostreams;

import java.io.*;
import java.util.ArrayList;

public class IOStreamPractice {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in)); // для чтения строк, символов, массивов
//        try {
//            String input = console.readLine(); // считываем с консоли построчно
//            System.out.println("Ваш input равен " + input); // вывели строку на консоль
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        } finally {
//            try {
//                console.close(); // закрываем консоль
//            } catch (IOException exception) {
//                exception.printStackTrace();
//            }
//        }

//        //try with resources // автоматически закрывает поток
//        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
        //в круглых скобках после выхода  из блока мы закрываем поток, кто реализует интерфейс AutoCloseable
//            String input = console.readLine();
//            System.out.println("Ваш input равен " + input);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }
        //если работаем с BufferedReader ,  не используем try catch

        File file = new File("src/main/resources/file.txt"); // создадим файл- объект типа файл,
//        // с параметрами -путь до файла ( где лежат не джава-файлы)
//        // правой кнопкой копи

        try (PrintWriter printWriter = new PrintWriter(file)) { //запишем  файл,
          //  PrintWriter - для записи файла
            printWriter.println("Строка1");
            printWriter.println("Строка2");
            printWriter.println("Строка3");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) { // считать из файла
//            // проассоц исходящий поток BufferedReader с этим же файлом
//            System.out.println(reader.readLine()); // считаем 1 строку
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

        ArrayList arrayList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) { // считать из файла
            // проассоц исходящий поток BufferedReader с этим же файлом
            String input;
            // считываем все строки, пробегаемся по всему файлу, пока считывание след. строки не null
            while ((input = reader.readLine()) != null) {
//                System.out.println("reader.readLine() = " + input);
                arrayList.add(input);
                System.out.println(arrayList);

            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }


        File file2 = new File("src/main/resources/file2.txt"); // создадим файл- объект типа файл,

        try (PrintWriter printWriter = new PrintWriter(file2)) { //запишем  файл,
            //  PrintWriter - для записи файла
            printWriter.println("Строка4");
            printWriter.println("Строка5");
            printWriter.println("Строка6");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        ArrayList arrayList2 = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) { // считать из файла
            // проассоц исходящий поток BufferedReader с этим же файлом
            String input;
            // считываем все строки, пробегаемся по всему файлу, пока считывание след. строки не null
            while ((input = reader.readLine()) != null) {
//                System.out.println("reader.readLine() = " + input);
                arrayList2.add(input);
                System.out.println(arrayList2);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        ArrayList tmpList = new ArrayList<>(arrayList2);
        tmpList = arrayList;
       arrayList = arrayList2;
        arrayList2= tmpList;

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println(arrayList);


        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }



        try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println(arrayList2);


        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
