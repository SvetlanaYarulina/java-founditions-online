package ru.itsjava.collections.arraylist;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;
    private java.lang.Object Object;
    private java.lang.Object element;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    //проверяем является ли объект пустым или нет
    public boolean isEmpty() {
        realSize = 0;
        return false;
    }

    // проверяем наличие объекта в списке
    public boolean contains(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i] == o && array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }


    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1]; // размер массива
            //копирование массива
            System.arraycopy(array, 0, resArray, 0, array.length);
            // массив с позции 0 копируем в resArray с позиции о и до последнего элемента
            array = resArray;
        }
        array[realSize++] = o;  //вставка последнего элемента и увеличиваем на 1
        return true;
    }

    public boolean remove(Object o) {
        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                delIndex = i;
                break;
            }
        }

        if (array.length - 1 - delIndex >= 0) {
            System.arraycopy(array, delIndex + 1, array, delIndex, array.length - 1 - delIndex);
        }

        if (delIndex == -1) {
            return false;
        } else {
            realSize--;
            return true;
        }
    }

    // удаляем все элементы из списка
    public void clear() {
        realSize = 0;
    }

    // получить объект с указанным индексом
    //Если index < 0 или index >= максимального количества элементов списка,
    // будет выброшено исключение IndexOutOfBoundsException.
    public Object get(int index) {
        checkIndex(index);
            return array[index];
    }


    // Замена элемента в указанной позиции index на переданный element. Индекс также должен быть больше нуля и
    // меньше индекса последнего элемента, иначе будет выброшено исключение IndexOutOfBoundsException
    //  размер списка не меняется.
    public Object set(int index, Object element) {
        checkIndex(index);
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = element;
            }
        }
            array[index] = element;
            return element;
    }
    // Этот метод вставляет указанный элемент в указанную позицию в этом списке. Он сдвигает элемент,
    // находящийся в данный момент в этом положении (если таковой имеется),
    // и любые последующие элементы вправо (добавит один к их индексам).
    public void add(int index, Object element) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        realSize++;
        int insertIndex = index;
        for (int i = array.length - 2; i >= insertIndex; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
    }



    public Object remove(int index) {
        checkIndex(index);

        Object resElement = array[index];
        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        }
        realSize--;
        return resElement;
    }

    //  проверяем корректен ли индекс
    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < realSize)) {
            return true;
        }
        return false;
    }

        // Этот метод возвращает индекс первого вхождения указанного элемента
        // в данный список или -1, если список не содержит элемента .
    public int indexOf(Object o) {
            if (o == null) {
                for (int i = 0; i < realSize; i++)
                    if (array[i]==null)
                        return i;
            } else {
                for (int i = 0; i < realSize; i++)
                    if (o.equals(array[i]))
                        return i;
            }
            return -1;
        }

       // находит индекс последнего вхождения в списке данного элемента:

    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = realSize-1; i >= 0; i--)
                if (array[i]==null)
                    return i;
        } else {
            for (int i = realSize-1; i >= 0; i--)
                if (o.equals(array[i]))
                    return i;
        }
        return -1;
    }

    @Override
    public String toString() {
//        return "MyArrayList{" + Arrays.toString(array) + '}';
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(' ');
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
