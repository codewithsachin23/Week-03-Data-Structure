package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class Main {
    public static void main(String[] args) {
        SocialMedia s1=new SocialMedia();

        s1.addUser("S123","sachin shukla",21);
        s1.addUser("s124","suraj patel",21);
        s1.addUser("s125","vivek sahu",22);

        s1.addConnection("S123","s124");
        s1.addConnection("S123","s125");
        s1.addConnection("S124","s125");
        s1.displayFriends("s124");

        s1.findMutualFriends("S123","s125");

    }
}
