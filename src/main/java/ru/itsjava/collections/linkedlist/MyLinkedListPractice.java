package ru.itsjava.collections.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.isEmpty();
        System.out.println("Пустой ли список:" + " " + list.isEmpty());

        list.add("Строка1");
        System.out.println("list = " + list);
        list.add("Строка2");
        System.out.println("list = " + list);
        list.add("Строка3");
        System.out.println("list = " + list);


        System.out.println(" list.size:" +  list.size());

        list.contains("Строка5");
        System.out.println("Есть ли элемент в списке:" + " " + list.contains(" Строка5"));
        list.contains("Строка2");
        System.out.println("Есть ли элемент в списке:" + " " + list.contains(" Строка2"));

        list.isEmpty();
        System.out.println("Пустой ли список:" + " " + list.isEmpty());



    }
}
