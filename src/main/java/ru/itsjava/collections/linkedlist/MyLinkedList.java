package ru.itsjava.collections.linkedlist;

public class MyLinkedList {
    private Node head; // первый элемент (узел)

    public int size() {
        int realSize;
        if (head == null) {
            realSize = 0;
        } else {
            Node curNode = head;           //  curNode - текущий узел
            realSize = 1;  // увеличиваем на 1
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
                realSize++;
            }
        }
        return realSize;
    }


    public boolean isEmpty() {
        return head == null;
    }


    public boolean contains(Object o) {
        if (head.getValue().equals(o)) return true;
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
                if (curNode.getValue().equals(o)) {
                    return true;
                }
            }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }

    // СТРОКА1 -> null
    // СТРОКА1 -> СТРОКА2 -> СТРОКА3 -> null
    public boolean remove(Object o) {
        if (head == null) return false; // проверяем , если head равен null, то false

        if (head.getValue().equals(o)) { // проверяем, если head не null и может совпадать с удаляемым элементом
            head = head.getNext(); // присваиваем следующий элемент
            return true;
        }

        if (head.getNext() == null) return false; // проверяем , если следующий элемент не null

        Node curNode = head; //присваеваем переменной предыдущего значения первый элемент
        Node prevNode = head; //присваеваем переменной текущего значения первый элемент

        while ((curNode = curNode.getNext()) != null) { // пробегаемся по листу
            // сначала оба равны head, при первой итерации curNode переходит в следущий элемент
            if (curNode.getValue().equals(o)) { // проверим, если мы попали на curNode,
                // если curNode.getValue совпал с объектом, то
                break; // выход из цикла
            }
            prevNode = prevNode.getNext(); // иначе перемещаем prevNode
        }

        if (curNode == null) return false; // если мы прбежались до конца списка и не нашли элемент,
        // проверим, есть ли элемент в коце списка

        prevNode.setNext(curNode.getNext());
        curNode.setNext(null);
        return true;
    }


    public void clear() {
        Node prevNode = head; //присваеваем переменной предыдущего значения первый элемент
        Node curNode = head; //присваеваем переменной текущего значения первый элемент

        while ((curNode = curNode.getNext()) != null) { //пробегаемся по листу
            prevNode.setValue(null);
            prevNode.setNext(null);
            prevNode = curNode; //присваиваем предыдущему значению стоящий после него элемент
        }
        head = null;
    }


    public Object get(int index) {
        checkIndex(index);
        int count = 0;
        Node curNode = head;
        while (curNode.getNext() != null) {
            if (count++ == index) {
                break;
            }
            curNode = curNode.getNext();
        }


        return curNode.getValue();
    }


    public Object set(int index, Object element) {
        checkIndex(index);
        Object resValue = null;
        int count = 0;
        Node curNode = head;
        while (curNode.getNext() != null) {
            if (count++ == index) {
                resValue = curNode.getValue();
                curNode.setValue(element);
                break;
            }
            curNode = curNode.getNext();
        }
        return resValue;
    }


    public void add(int index, Object element) {
        checkIndex(index);
        Node resNode = new Node(element, null);
        Node curNode = head;// присваиваем переменной значение нулевого узла
        Node nextNode = head.getNext();// присваиваем переменной узел, следующий за нулевым
        for (int i = 0; i <= index; i++) {//пробегаемся по листу
            if (i == 0) { // если индекс равен 0, создаем новый узел
                head = resNode;
                resNode.setNext(curNode);
                break;
            } else {
                if (i == index) {// если нашли искомый узел по индексу
                    curNode.setNext(resNode);
                    resNode.setNext(nextNode);
                    break;
                }
            }
            curNode = curNode.getNext();//присваиваем переменной следующий узел
            nextNode = nextNode.getNext();//присваиваем переменной следующий узел
        }
    }


    public Object remove(int index) {
        checkIndex(index); // проверяем корректность индекса
        if (index == 0) { // проеряем если индекс равен 0, то удаляем head
            Object resValue = head.getValue(); //присваиваем удаляемому значению значение с нулевым индексом (первый элемент)
            if (head.getNext() == null) { //проверяем, единственный ли это элемент в листе
                head = null;  //если единственный, зануляем его
            } else { // иначе
                head = head.getNext();// присваиваем  head следущий элемент
            }
            return resValue; //возвращаем удаляемый элемент
        }
        // нужно пробежаться до того элемента, который мы хотим удалить
        Node curNode = head;
        Node prevNode = head; // node до curNode
        int count = 0; // создаём счетчик
        while ((curNode = curNode.getNext()) != null) { // бежим до конца масссива
            count++; //увеличиваем счётчик на 1
            if (count == index) { //если счётчик равен искомому индексу, значит нашли нужный элемент
                break; //выходим из цикла
            }
            prevNode = prevNode.getNext(); //присваиваем предыдущему значению стоящий после него элемент
        }
        //если удаляем с конца
        if (curNode == null) // проверяем если curNode не null
            return null;
        Object resValue = curNode.getValue(); //присваиваем переменной значение текущего элемента

        if (curNode.getNext() == null) { //проверяем, если текущий элемент последний
            prevNode.setNext(null); //зануляем элемент после предыдущего элемента
        } else {
            prevNode.setNext(curNode.getNext()); //присваиваем элементу после предыдущего, значение следующего за текущим
            curNode.setNext(null); // зануляем следующий элемент после текущего
        }

        return resValue;  //возвращаем значение удаляемого элемента
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < size())) {  // вызываем метод size
            return true;
        }
        return false;
    }

    // Если элемент присутствует, то возвращается индекс первого вхождения элемента,
// в противном случае возвращается -1, если список не содержит элемент.
    public int indexOf(Object o) {
        int count = 0;
        int index = 0;
        Node curNode = head;
        while (curNode.getNext() != null) {
            if (curNode.getValue().equals(o)) {
                index = count;
                break;
            }
            curNode = curNode.getNext();
            count++;
        }
        if (curNode.getNext() == null) {
            if (curNode.getValue().equals(o)) {
                index = (size() - 1);
            }
            return index;
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        int count = 0;
        int index = 0;
        Node curNode = head;
        while (curNode.getNext() != null) {
            if (curNode.getValue().equals(o)) {
                index = count;
            }
            curNode = curNode.getNext();
            count--;
        }
        if (curNode.getNext() == null) {
            if (curNode.getValue().equals(o)) {
                index = (size() - 1);
            }
        }
        return index;
    }


    @Override
    public String toString() {
        return "MyLinkedList{" + "head=" + head + "}";
    }
}

