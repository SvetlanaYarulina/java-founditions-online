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
        System.out.println("Есть ли элемент в списке:" + " " + list.contains(" Строка1"));

        list.isEmpty();
        System.out.println("Пустой ли список:" + " " + list.isEmpty());

        list.remove(0);
        System.out.println(list);

        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1) = " + list.get(1));
      //  System.out.println("list.get(2) = " + list.get(2));

        list.set(0, "Строка4");
        System.out.println(list);

//        list.clear();
//        System.out.println(list);

        int index1 = list.indexOf("Строка2");
        System.out.println("index1 = " + index1);

        int index2 = list.indexOf("Строка4");
        System.out.println("index2 = " + index2);

        int index = list.lastIndexOf("Строка4");
        System.out.println("list.lastIndexOf(\"Строка4\") = " + list.lastIndexOf("Строка4"));


        list.add(0,"Строка7");
        System.out.println("list = " + list);


    }
}
