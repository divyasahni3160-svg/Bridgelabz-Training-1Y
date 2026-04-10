package com.gla;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryService {
    private Library library;
    private Map<Book, Person> borrowedBooks = new HashMap<>();
    public boolean issueBook(Book book,Person person){
        if (library != null && book != null && book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.put(book, person);
            System.out.println("Book issued: " + book.getTitle() + " to " + person.getName());
            return true;
        }
        System.out.println("Book cannot be issued.");
        return false;

    }
    public boolean returnBook(Book book,Person person){
        if (library != null && book != null && borrowedBooks.containsKey(book)) {
            if (borrowedBooks.get(book).equals(person)) {
                book.returnBook();
                borrowedBooks.remove(book);
                System.out.println("Book returned: " + book.getTitle() + " by " + person.getName());
                return true;
            }
        }
        System.out.println("Book cannot be returned.");
        return false;

    }
    public boolean setRepositary(Library library){
        if (library != null) {
            this.library = library;
            return true;
        }
        return false;
    }
}