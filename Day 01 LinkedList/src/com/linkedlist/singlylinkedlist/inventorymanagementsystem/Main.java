package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class Main {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        // Add items
        inventory.addAtBeg("ItemA", "101", 50, 20.0);
        inventory.addAtEnd("ItemB", "102", 30, 15.0);
        inventory.addAtPosition("ItemC", "103", 40, 25.0, 1);

        // Display inventory
        inventory.displayInventory();

        // Remove item
        inventory.removeByItemId("102");

        // Update quantity
        inventory.updateQuantity("101", 60);

        // Search for an item
        inventory.searchItem("ItemC", "0");

        // Calculate total value
        inventory.calculateTotalValue();

        // Sort by name (ascending)
        inventory.sortByName(true);
        inventory.displayInventory();

    }
}
