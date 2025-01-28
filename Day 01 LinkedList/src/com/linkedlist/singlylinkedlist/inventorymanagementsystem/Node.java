package com.linkedlist.singlylinkedlist.inventorymanagementsystem;
public class Node {
    protected String itemName;
    protected String itemID;
    protected double quantity;
    protected double price;
    Node next;

    public Node(String itemName,String itemID,double quantity,double price){
        this.itemID=itemID;
        this.itemName=itemName;
        this.quantity=quantity;
        this.price=price;
        this.next=null;

    }
}
