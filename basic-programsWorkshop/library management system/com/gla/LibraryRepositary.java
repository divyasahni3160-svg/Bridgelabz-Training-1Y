package com.gla;

import java.util.ArrayList;
import java.util.List;

public class LibraryRepositary {
    private List<Book> booklist = new ArrayList<>();
    public void addBook(Book book) {
        booklist.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(Book book) {
        if (booklist.remove(book)) {
            System.out.println("Book removed: " + book.getTitle());
        } else {
            System.out.println("Book not found!");
        }
    }

    public Book findBookById(int id) {
        for (Book b : booklist) {
            if (b.getId() == id) return b;
        }
        return null;

    }
    public List<Book> getBooks() { return booklist; }

    public void showAllBooks() {
        if (booklist.isEmpty()) {
            System.out.println("No books in library.");
        } else {
            for (Book b : booklist) {
                System.out.println(b);
            }
        }
    }
}
