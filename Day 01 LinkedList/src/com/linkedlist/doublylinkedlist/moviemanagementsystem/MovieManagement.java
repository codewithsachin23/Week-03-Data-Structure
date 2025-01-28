package com.linkedlist.doublylinkedlist.moviemanagementsystem;
public class MovieManagement {
    private MovieNode head;
    private MovieNode tail;
    public void addAtBeg(String title, String director, int year, double rating){
        MovieNode newNode=new MovieNode(title, director, year,rating);
       if(head==null){
           head=tail=newNode;
       }else {
           newNode.next=head.next;
           head.prev=newNode;
           head=newNode;
       }
    }
    public void addAtEnd(String title, String director, int year, double rating){
        MovieNode newNode=new MovieNode(title, director, year,rating);
        if(head==null){
            head=tail=newNode;
        }else {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }

    }
    public void addAtPosition(String title, String director, int year, double rating,int position){
        MovieNode newNode=new MovieNode(title, director, year,rating);
        if(position==0){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }
            MovieNode currentNode=head;
           for (int i=1;i<position&&currentNode!=null;i++){
               currentNode=currentNode.next;
           }

        if (currentNode == tail || currentNode == null) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            return;
        }
        newNode.next = currentNode.next;
        if (currentNode.next != null) {
            currentNode.next.prev = newNode;
        }
        currentNode.next = newNode;
        newNode.prev = currentNode;
    }

    public void removeByTitle(String title) {
        if (head==null){
            System.out.println("List is empty!");
            return;
        }

        MovieNode currentNode=head;
        while (currentNode != null) {
            if (currentNode.MovieTitle.equalsIgnoreCase(title)) {
                // Case 1: Node is in the middle or end of the list
                if (currentNode.prev != null) {
                    currentNode.prev.next = currentNode.next;
                } else {
                    // Case 2: Node is the head
                    head = currentNode.next;
                }

                if (currentNode.next != null) {
                    currentNode.next.prev = currentNode.prev;
                } else {
                    // Case 3: Node is the tail
                    tail = currentNode.prev;
                }

                System.out.println("Movie removed: " + title);
                return;
            }
            currentNode = currentNode.next;
        }

        // If we finish the loop, the movie was not found
        System.out.println("Movie not found: " + title);
    }
    public void searchByDirector(String director){
        if (head==null){
            System.out.println("List is empty!");
            return;
        }
        MovieNode currentNode=head;
        while(currentNode.next!=null){
            if(currentNode.director.equals(director)){
                 System.out.println("Found: " + currentNode.MovieTitle + " (Director: " + currentNode.director + ", Year: " + currentNode.Year + ", Rating: " + currentNode.rating + ")");
                return;
            }
            currentNode=currentNode.next;
        }
        System.out.println("movie not found");
    }
    public void searchByRating(double rating) {
        if (head==null){
            System.out.println("List is empty!");
            return;
        }
        MovieNode currentNode=head;
        while(currentNode.next!=null){
            if(currentNode.rating==rating){
                System.out.println("Found: " + currentNode.MovieTitle + " (Director: " + currentNode.director + ", Year: " + currentNode.Year + ", Rating: " + currentNode.rating + ")");
                return;
            }
            currentNode=currentNode.next;
        }
        System.out.println("movie not found");
    }
    public void displayForward() {
        MovieNode current = head;
        if (head==null){
            System.out.println("List is empty!");
            return;
        }
        while (current!=null){
            System.out.println(current.MovieTitle + " (Director: " + current.director + ", Year: " + current.Year + ", Rating: " + current.rating + ")");
            current=current.next;
        }
    }
    public void displayReverse() {
        MovieNode current = tail;
        if (head==null){
            System.out.println("List is empty!");
            return;
        }
        while (current!=null){
            System.out.println(current.MovieTitle + " (Director: " + current.director + ", Year: " + current.Year + ", Rating: " + current.rating + ")");
            current=current.prev;
        }
    }
    public void updateRating(String title, double newRating) {
        if (head==null){
            System.out.println("List is empty!");
            return;
        }
        MovieNode current = head;
        while (current!=null){
            if(current.MovieTitle.equals(title)){
                current.rating=newRating;
                System.out.println("Rating update "+ newRating);
            }
            current=current.next;
        }
        System.out.println("movie not found");
    }

}
