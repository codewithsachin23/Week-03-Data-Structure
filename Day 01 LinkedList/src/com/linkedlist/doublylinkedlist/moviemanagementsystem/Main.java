package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {
        MovieManagement movie=new MovieManagement();


        movie.addAtBeg("The Iron man", "Robert Ton", 2008, 9.3);
        movie.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movie.addAtPosition("The Godfather", "Francis Ford Coppola", 1972, 9.2,2);

        // Display movies
        movie.displayForward();
        System.out.println();

        movie.displayReverse();
        System.out.println();
       movie.updateRating("Inception", 9.0);
        System.out.println();
        movie.searchByDirector("Christopher Nolan");
        System.out.println();
        movie.removeByTitle("The Godfather");
    }
}
