package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class InventoryManagement {
    Node head;
    public void addAtBeg(String itemName,String itemID,double quantity,double price){
        Node newNode=new Node(itemName,itemID,quantity,price);
        newNode.next=head;
        head=newNode;
    }
    public void addAtEnd(String itemName,String itemID,double quantity,double price) {
        Node newNode = new Node(itemName, itemID, quantity, price);
        if(head==null){
            head=newNode;
        }else {
            Node currentNode=head;

            while (currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
        }
    }
    public void addAtPosition(String itemName,String itemID,double quantity,double price,int position) {
        Node newNode = new Node(itemName, itemID, quantity, price);
        if(position==0){
            addAtBeg(itemName, itemID, quantity, price);
            return;
        }
        Node current=head;
        while (current!=null){
            current=current.next;
        }

        if (current == null) {
            System.out.println("Position out of range!");
            return;
        }else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    public void removeByItemId(String itemId) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if(head.itemID.equals(itemId)){
         head=head.next;
         System.out.println("Item removed: " + itemId);
        return;
        }
        Node current=head;
        while (current.next!=null&&current.next.itemID!=itemId){
            if(current.itemID.equals(itemId)){
                current.next=current.next.next;
                System.out.println("Item removed: " + itemId);
                return;
            }
            current=current.next;
        }
        System.out.println("Item not found: " + itemId);

    }
    // Update the quantity of an item by Item ID
    public void updateQuantity(String itemID, double newQuantity) {
       Node current = head;
        while (current != null) {
            if (current.itemID.equals(itemID)) {
                current.quantity = newQuantity;
                System.out.println("Quantity updated for Item ID " + itemID);
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found: " + itemID);
    }
    public void searchItem(String itemName,String itemID) {
       Node current = head;
        while (current != null) {
            if (current.itemID.equals(itemID) || current.itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Item Found: " +
                        " Name=" + current.itemName +
                        ", ID=" + current.itemID +
                        ", Quantity=" + current.quantity +
                        ", Price=" + current.price);
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found!");
    }
    public void calculateTotalValue() {
        double totalValue = 0;
     Node current = head;
        while (current != null) {
            totalValue += current.quantity * current.price;
            current = current.next;
        }
        System.out.println("Total Inventory Value: $" + totalValue);
    }

    // Sort the inventory based on Item Name (ascending or descending)
    public void sortByName(boolean ascending) {
        if (head == null || head.next == null) return;

        Node current, index;
        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if ((ascending && current.itemName.compareToIgnoreCase(index.itemName) > 0) ||
                        (!ascending && current.itemName.compareToIgnoreCase(index.itemName) < 0)) {
                    // Swap data
                    String tempName = current.itemName;
                    String tempId = current.itemID;
                    double tempQuantity = current.quantity;
                    double tempPrice = current.price;

                    current.itemName = index.itemName;
                    current.itemID = index.itemID;
                    current.quantity = index.quantity;
                    current.price = index.price;

                    index.itemName = tempName;
                    index.itemID = tempId;
                    index.quantity = tempQuantity;
                    index.price = tempPrice;
                }
            }
        }
    }


    // Display the inventory
    public void displayInventory() {
      Node current = head;
        if (current == null) {
            System.out.println("Inventory is empty!");
            return;
        }

        System.out.println("Inventory List:");
        while (current != null) {
            System.out.println("Name: " + current.itemName +
                    ", ID: " + current.itemID +
                    ", Quantity: " + current.quantity +
                    ", Price: " + current.price);
            current = current.next;
        }
    }



    }
