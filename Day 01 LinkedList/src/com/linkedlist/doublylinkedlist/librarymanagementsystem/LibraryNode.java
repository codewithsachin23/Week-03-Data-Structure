package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryNode {
    protected String bookTitle;
    protected String author;
    protected String bookID;
    protected String genre;

    protected boolean  availabilityStatus;

    LibraryNode next;
    LibraryNode prev;
    public LibraryNode(String bookTitle, String author, String genre, String bookID, boolean isAvailable) {
        this.bookTitle=bookTitle;
        this.author=author;
        this.bookID=bookID;
        this.genre=genre;
        this.availabilityStatus=isAvailable;
        this.next=null;
        this.prev=null;
    }




    }
