package controllers;

import models.Book;
import java.util.*;

public class LibroController {
    
    public Map<Book, Book> procesarLibros(List<Book> libros) {
        Comparator<Book> comparator = Comparator.comparing(Book::getTitle, Comparator.reverseOrder())
                .thenComparingInt(Book::getYear);
        Map<Book, Book> map = new TreeMap<>(comparator);
        for (Book libro : libros) {
            map.put(libro, libro);
        }
        return map;
    }
}
