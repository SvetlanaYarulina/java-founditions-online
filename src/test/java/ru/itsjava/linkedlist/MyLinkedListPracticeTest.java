package ru.itsjava.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collections.linkedlist.MyLinkedList;

public class MyLinkedListPracticeTest {
    MyLinkedList list = new MyLinkedList();

    public final Object DEFAULT_ELEMENT = "element1";
    public final Object NEW_ELEMENT = "element2";

    @DisplayName("MyLinkedList должен:корректно выводить размер листа")
    @Test
    public void shouldHaveCorrectPrintSize() {
        list.add(DEFAULT_ELEMENT);
        Assertions.assertEquals(1, list.size());
    }


    @DisplayName("корректно добавлять элемент в список")
    @Test
    public void shouldHaveCorrectAddElement() {
        Assertions.assertEquals(true, list.add(DEFAULT_ELEMENT));
//        Assertions.assertTrue(list.contains(DEFAULT_ELEMENT));
    }


    @DisplayName("корректно проверять, пустой ли список")
    @Test
    public void shouldHaveCorrectCheckEmptiness() {
        list.add(DEFAULT_ELEMENT);
        Assertions.assertFalse(list.isEmpty());
    }


    @DisplayName("корректно проверять наличие элемента в списке")
    @Test
    public void shouldHaveCorrectCheckHavingObject() {
        list.add(DEFAULT_ELEMENT);
        Assertions.assertTrue(list.contains(DEFAULT_ELEMENT));
    }


    @DisplayName("корректно удалять все элементы из списка")
    @Test
    public void shouldHaveCorrectClearList() {
        list.add(DEFAULT_ELEMENT);
        list.clear();
        Assertions.assertEquals(0, list.size());
    }


    @DisplayName("корректно удалять элемент из списка")
    @Test
    public void shouldHaveCorrectRemoveElement() {
        list.add(DEFAULT_ELEMENT);
        Assertions.assertTrue(list.remove(DEFAULT_ELEMENT));
        Assertions.assertEquals(0, list.size());
    }


    @DisplayName("корректно удалять элемент из списка по индексу элемента")
    @Test
    public void shouldHaveCorrectRemoveElementByIndex() {
        list.add(DEFAULT_ELEMENT);
        list.add(NEW_ELEMENT);
//        Assertions.assertEquals(DEFAULT_ELEMENT, list.remove(0));
//        Assertions.assertEquals(DEFAULT_ELEMENT2, list.get(0));
        Assertions.assertEquals(NEW_ELEMENT, list.remove(1));
//        Assertions.assertEquals(null, list.get(1));
        Assertions.assertEquals(1, list.size());
    }


    @DisplayName("корректно выводить элемент по индексу")
    @Test
    public void shouldHaveCorrectPrintElementByIndex() {
        list.add(DEFAULT_ELEMENT);
        list.add(NEW_ELEMENT);
        Assertions.assertEquals(DEFAULT_ELEMENT, list.get(0));
    }




    @DisplayName("корректно добавлять элемент в список по индексу")
    @Test
    public void shouldHaveCorrectAddElementByIndex() {
        list.add(DEFAULT_ELEMENT);
        list.add(0, NEW_ELEMENT);
        Assertions.assertEquals(NEW_ELEMENT, list.get(0));
    }


    @DisplayName("корректно выводить индекс элемента")
    @Test
    public void shouldHaveCorrectPrintIndexOfObject() {
        list.add(DEFAULT_ELEMENT);
        Assertions.assertEquals(0, list.indexOf(DEFAULT_ELEMENT));
    }


    @DisplayName("корректно выводить последний индекс элемента")
    @Test
    public void shouldHaveCorrectPrintLastIndexOfObject() {
        list.add(DEFAULT_ELEMENT);
        list.add(NEW_ELEMENT);
        list.add(DEFAULT_ELEMENT);
        Assertions.assertEquals(2, list.lastIndexOf(DEFAULT_ELEMENT));
    }
}


