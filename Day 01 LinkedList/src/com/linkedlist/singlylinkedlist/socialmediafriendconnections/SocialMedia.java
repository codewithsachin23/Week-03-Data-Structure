package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

import java.util.HashSet;
import java.util.Set;

public class SocialMedia {
    UserNode head;

    public void addUser(String userId, String name, double age){
        if(getUserById(userId)!=null){
            System.out.println("User already exit!");
            return;
        }
        UserNode newUser = new UserNode(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            UserNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newUser;
        }
    }

    public void addConnection(String userID1,String userID2){
        UserNode userA=getUserById(userID1);
        UserNode userB=getUserById(userID2);

        if(userA!=null&&userB!=null){
            addFriendToUser(userA,userID2);
            addFriendToUser(userB,userID1);
        }
    }

    private void addFriendToUser(UserNode user, String friendID){
        FriendNode newFriend=new FriendNode(friendID);
        if(user.friendList==null){
            user.friendList=newFriend;
        }else{
            FriendNode current=user.friendList;
            while (current.next!=null){
                current=current.next;
            }

            current.next=newFriend;
        }
    }
    public void removeConnection(String userID1,String userID2){
        UserNode userA=getUserById(userID1);
        UserNode userB=getUserById(userID2);

        if(userA!=null&&userB!=null){
            removeFriendToUser(userA,userID2);
            removeFriendToUser(userB,userID1);
        }
    }
    private void removeFriendToUser(UserNode user, String friendID){
        if(user.friendList==null){
            System.out.println("No friend have in this user");
        }else{
            FriendNode current=user.friendList;

            if (current.friendID.equals(friendID)) {
                user.friendList = current.next;
                System.out.println("Friend removed: " + friendID);
                return;
            }
            while (current.next!=null&&current.next.friendID!=friendID){
                current=current.next;
            }
            if (current.next == null) {
                System.out.println("no fiend found");
            }else {

            current.next=current.next.next;
                System.out.println("connection lost");
            }
        }
    }
    public void findMutualFriends(String userID1, String userID2) {
        UserNode user1 = getUserById(userID1);
        UserNode user2 = getUserById(userID2);

        if (user1 != null && user2 != null) {
            if (user1.friendList == null || user2.friendList == null) {
                System.out.println("No mutual friends found.");
                return;
            }
            Set<String>user1Friend=new HashSet<>();
            FriendNode current1=user1.friendList;

            while(current1!=null){
                user1Friend.add(current1.friendID);
                current1=current1.next;
            }

            FriendNode current2=user2.friendList;
            while (current2!=null){
                if(user1Friend.contains(current2)){
                    System.out.println("Mutual friend: " + current2.friendID);
                }
                current2=current2.next;
            }
            System.out.println("No mutual friends found.");
        }
    }

    public void displayFriends(String userID){
        UserNode user = getUserById(userID);
        if(user!=null){
            FriendNode friend=user.friendList;
            System.out.print("Friends of " + user.name + ": ");
            while (friend!=null){
                System.out.println("Friends "+friend.friendID);
                friend=friend.next;

            }
            System.out.println();
        }
    }

    public UserNode getUserById(String userId){
        UserNode current=head;
        while (current!=null) {
            if (current.userID.equals(userId)) {
                return current;
            }
            current=current.next;
        }
        return null;
    }
    public UserNode getUserByName(String name){
        UserNode current=head;
        while (current!=null) {
            if (current.userID.equals( name)) {
                return current;
            }
            current=current.next;
        }
        return null;
    }

    public void countFriend(String userId){
        UserNode user = getUserById(userId);
        int count=0;
        if(user!=null){
            FriendNode friend=user.friendList;
            while (friend!=null){
                count++;
                friend=friend.next;
            }
        }
        System.out.println("total friend "+count);
    }





}
