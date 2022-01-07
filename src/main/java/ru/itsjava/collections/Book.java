package ru.itsjava.collections;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private final String name;
    private String author;
    private double numberOfPages;
}
