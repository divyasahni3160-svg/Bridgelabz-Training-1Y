package com.gla;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private int quantity;
    private Admin admin;

    private List<Person> users = new ArrayList<>();

    public Library() { }

    public Library(Admin admin) {
        this.admin = admin;
    }
    public void addBook(Book book) {
        libraryRepositary.addBook(book);
        quantity = libraryRepositary.getBooks().size();
    }

    public void removeBook(Book book) {
        libraryRepositary.removeBook(book);
        quantity = libraryRepositary.getBooks().size();
    }

    public void registerUser(Person person) {
        users.add(person);
        System.out.println("User registered: " + person.getName());
    }

    public void showBooks() { libraryRepositary.showAllBooks(); }
    public void showUsers() { users.forEach(System.out::println); }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public LibraryRepositary libraryRepositary = new LibraryRepositary();
}
