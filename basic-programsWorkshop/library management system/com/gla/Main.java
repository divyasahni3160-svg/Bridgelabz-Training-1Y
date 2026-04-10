package com.gla;

public class Main {
    public static void main(String[] args){

        LibraryRepositary libraryRepositary = new LibraryRepositary();

        Admin admin = new Admin(1, "Divya", "divya@example.com", "CSE Department");
        Library library = new Library(admin);library.libraryRepositary = new LibraryRepositary();

        Book b1 = new Book(101, "Effective Java", "Joshua Bloch", "Pearson", 700, Category.SCIENCE);
        Student s1 = new Student(201, "Rahul", "rahul@example.com", 45, 2, Branch.CSE);

        library.addBook(b1);
        library.registerUser(s1);
        LibraryService service = new LibraryService();
        service.setRepositary(library);

        service.issueBook(b1,s1);
        service.returnBook(b1,s1);
    }

}
