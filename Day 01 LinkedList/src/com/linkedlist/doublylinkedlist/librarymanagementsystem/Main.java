package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        LibraryManagement l1=new LibraryManagement();
        l1.addAtEnd("hw","sa","asc","32sas",true);
        l1.addAtBeg("hw","sa","as","31sas",true);
        l1.addAtEnd("hw","sa","as","30sas",true);
        l1.addAtPosition("hw","sa","as","33sas",true,2);

        l1.displayBooksForward();
        l1.displayBooksReverse();

    }
}
