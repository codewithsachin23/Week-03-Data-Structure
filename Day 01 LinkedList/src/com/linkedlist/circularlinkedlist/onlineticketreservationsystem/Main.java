package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class Main {
    public static void main(String[] args) {
        OnlineTicketReservationSystem system=new OnlineTicketReservationSystem();

        // Add tickets
        system.addTicket(101, "sachin", "Inception", "A1", "10:00 AM");
        system.addTicket(102, "Vivek", "Interstellar", "B2", "01:00 PM");
        system.addTicket(103, "Suraj", "Inception", "C3", "04:00 PM");

        // Display tickets
        system.displayTickets();
        System.out.println();
        // Search for a ticket
        system.searchTicket("Inception");
        System.out.println();
        // Remove a ticket
        system.removeTicket(102);
        System.out.println();
        // Display tickets again
        system.displayTickets();

        // Count total tickets
        System.out.println("Total tickets booked: " + system.countTickets());
    }

}

