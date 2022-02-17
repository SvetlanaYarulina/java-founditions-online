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
        int index5 = list1.indexOf("element1");
        System.out.println("index5 = " + index5);


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

        MyArrayList list2 = new MyArrayList();
        list2.add("element1");
        list2.add("element2");
        list2.add("element3");
        list2.add("element3");

        System.out.println(list2);
        int index1 = list2.indexOf("element1");
        System.out.println("index1 = " + index1);
        int index2 = list2.indexOf("element4");
        System.out.println("index2 = " + index2);

        int lastIndex = list2.lastIndexOf("element3");
        System.out.println("lastIndex:" + " " + lastIndex);
        int lastIndex1 = list2.lastIndexOf("element5");
        System.out.println("lastIndex1:" + " " + lastIndex1);

        System.out.println("Первый элемент в списке:" +" " + list2.get(0));
        System.out.println("Третийэлемент в списке:" +" " + list2.get(2));
       // System.out.println("Десятый элемент в списке:" +" " + list2.get(9));
        list2.set(0, 11);
        System.out.println(list2);
        list2.set(3, 15);
        System.out.println(list2);

        list2.add(0, "element5");
        System.out.println(list2);

        list2.add(3, "18");
        System.out.println(list2);




        MyArrayList list3 = new MyArrayList();
        int index0 = list3.indexOf(null);
        System.out.println("index0 = " + index0);
    }
}

