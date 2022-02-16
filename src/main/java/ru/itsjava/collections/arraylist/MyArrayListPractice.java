package ru.itsjava.collections.arraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size());
        list.add("Привет");
        list.add("Пока");
        System.out.println("После добавления двух элементов размер равен "
                + list.size());
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        System.out.println("list.size() = " + list.size());

        System.out.println(list);

//        System.out.println("list.remove(\"Привет\") = " + list.remove("Привет"));
//        System.out.println("list.size() = " + list.size());
//        System.out.println(list);
//
//        System.out.println("list.remove(\"Пока\") = " + list.remove("Пока"));
//        System.out.println(list);

        list.add("До_свидания");
        System.out.println(list);
//        list.remove(9);
//        System.out.println(list);
//
        list.remove(1);
        System.out.println(list);

        list.isEmpty();
        System.out.println("Пустой ли список:" + " " + list.isEmpty());

        list.contains("До_свидания");
        System.out.println("Есть ли элемент в спис:" + " " + list.contains(" До_свидания"));
        
        list.contains("Пока");
        System.out.println("Есть ли элемент в списке:" + " " + list.contains(" Пока"));


        list.clear();
        System.out.println("Очистили список:" + " " + list);

        MyArrayList list1 = new MyArrayList();
        list1.isEmpty();
        System.out.println("Пустой ли список:" + " " + list1.isEmpty());

        list1.add("element1");
        list1.add("element2");
        System.out.println(list1);
        list1.contains("element1");
        System.out.println("Есть ли в списке элемент:" + " " + list1.contains("element1"));
        list1.contains("element3");
        System.out.println("Есть ли в списке элемент:" + " " + list1.contains("element3"));
        list1.isEmpty();
        System.out.println("Пустой ли список:" + " " + list1.isEmpty());
        list1.clear();
        System.out.println(list1);


    }
}

