package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class FriendNode {
    protected String friendID;
    FriendNode next;

    public FriendNode(String friendID){
        this.friendID=friendID;
        this.next=null;
    }
}