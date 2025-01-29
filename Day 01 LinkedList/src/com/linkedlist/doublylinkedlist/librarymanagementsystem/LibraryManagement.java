package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryManagement {

    LibraryNode head, tail;

    public void addAtBeg(String bookTitle, String author, String genre, String bookID, boolean isAvailable) {
        LibraryNode newNode = new LibraryNode(bookTitle, author, genre, bookID, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addAtEnd(String bookTitle, String author, String genre, String bookID, boolean isAvailable) {
        LibraryNode newNode = new LibraryNode(bookTitle, author, genre, bookID, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtPosition(String bookTitle, String author, String genre, String bookID, boolean isAvailable, int position) {
        if (position == 0) {
            addAtBeg(bookTitle, author, genre, bookID, isAvailable);
            return;
        }
        LibraryNode newNode = new LibraryNode(bookTitle, author, genre, bookID, isAvailable);
        LibraryNode current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            addAtEnd(bookTitle, author, genre, bookID, isAvailable);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    public void removeBook(String bookId) {
        LibraryNode current = head;
        while (current != null && !current.bookID.equals(bookId)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Book not found.");
            return;
        }
        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else {
            current.prev.next = current.next;
        }
        if (current == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            current.next.prev = current.prev;
        }
    }

    public void updateAvailability(String bookId, boolean available) {
        LibraryNode current = head;
        while (current != null) {
            if (current.bookID.equals(bookId)) {
                current.availabilityStatus = available;
                return;
            }
            current = current.next;
        }
        System.out.println("Book not found.");
    }

    public void displayBooksForward() {
        LibraryNode current = head;
        while (current != null) {
            displayBookDetails(current);
            current = current.next;
        }
    }

    public void displayBooksReverse() {
        LibraryNode current = tail;
        while (current != null) {
            displayBookDetails(current);
            current = current.prev;
        }
    }

    private void displayBookDetails(LibraryNode node) {
        System.out.println("Title: " + node.bookTitle);
        System.out.println("Author: " + node.author);
        System.out.println("Genre: " + node.genre);
        System.out.println("Book ID: " + node.bookID);
        System.out.println("Availability: " + (node.availabilityStatus ? "Available" : "Not Available"));
        System.out.println("--------------------");
    }

    public int countBooks() {
        int count = 0;
        LibraryNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}