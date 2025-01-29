package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class UserNode {
    protected String userID;
    protected String name;
    protected double age;
    FriendNode friendList;
    UserNode next;
    public UserNode(String userID,String name,double age){
        this.userID=userID;
        this.name=name;
        this.age=age;
        this.friendList=null;
        this.next=null;

    }
}
