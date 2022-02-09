package ru.itsjava.collections;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private final String name;
    private String author;
    private double numberOfPages;



    // Вывести список на экран в формате: List: [ Book{"7 навыков высокоэффективных людей", "Кови", 387};
    //Book{"Java. Эффективное программирование", "Блох Дж.", 219};]

    @Override
    public String toString() {
        return "Book{" + name + ", " + author + " ," + numberOfPages + "}";
    }
}

