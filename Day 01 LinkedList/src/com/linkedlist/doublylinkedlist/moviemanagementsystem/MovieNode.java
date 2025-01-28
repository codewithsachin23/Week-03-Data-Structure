package com.linkedlist.doublylinkedlist.moviemanagementsystem;

import com.linkedlist.singlylinkedlist.inventorymanagementsystem.Node;

public class MovieNode {
    protected String MovieTitle;
    protected String director;
    protected int Year ;
    protected double rating;
    MovieNode next;
    MovieNode prev;
    public MovieNode(String MovieTitle,String director,int Year,double rating){
        this.director=director;
        this.MovieTitle=MovieTitle;
        this.Year=Year;
        this.rating=rating;
        this.next=null;
        this.prev=null;
    }
}
