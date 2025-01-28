package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentRecord {
    private StudentNode head;
    public void addAtBeg(String name,String rollNumber,double age,String grade){
        StudentNode newNode=new StudentNode( name, rollNumber,age,grade);
        newNode.next=head;
        head=newNode;
    }
    public void addAtEnd(String name,String rollNumber,double age,String grade){
        StudentNode newNode=new StudentNode( name, rollNumber,age,grade);
        if(head==null){
            head=newNode;

        }else {
        StudentNode currentNode=head;

        while(currentNode.next!=null){
           currentNode= currentNode.next;
        }
        currentNode.next=newNode;
        }
    }
    public void addAtPosition(String name,String rollNumber,double age,String grade,int position){
        StudentNode newNode=new StudentNode( name, rollNumber,age,grade);
        if(position==0){
          newNode.next=head;
          head=newNode;
            return;
        }
        StudentNode currentNode=head;
        for(int i=1;i<position&&currentNode!=null;i++){
            currentNode= currentNode.next;
        }

        if (currentNode == null) {
            System.out.println("Position out of bounds. Node not added.");
        } else {

        newNode.next=currentNode.next;
        currentNode.next=newNode;
    }

    }
    public void deleteByRollNumber(String rollNumber){


        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if(head.rollNumber==rollNumber){
            head=head.next;
            System.out.println("Deleted !");
            return;
        }
        StudentNode newNode=head;

        while(newNode.next!=null&&!newNode.next.rollNumber.equals(rollNumber)){
            newNode=newNode.next;
        }
        if(newNode.next==null){
            System.out.println("roll number not found");
        }else {
            newNode.next=newNode.next.next;
            System.out.println("Deleted !");
        }


    }
    public void searchByRollNumber(String rollNumber){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        StudentNode newNode=head;

        while(newNode!=null){
            if(newNode.rollNumber.equals(rollNumber)){
                System.out.println("Student Found: Roll Number: " + newNode.rollNumber + ", Name: " + newNode.name + ", Age: " + newNode.age + ", Grade: " + newNode.grade);
                return;

            }else {
            newNode=newNode.next;
        }

        }
    }
    public void updateGradeByRollNumber(String rollNumber, String newGrade){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        StudentNode newNode=head;

        while(newNode!=null){
            if(newNode.rollNumber.equals(rollNumber)){
                newNode.grade=newGrade;
                System.out.println("grade Update!"+newGrade);
                return;
            }else {
                newNode=newNode.next;
            }
        }

    }

    public void displayAllRecords() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        StudentNode newNode=head;

        while(newNode!=null){
            System.out.println("Student Found: Roll Number: " + newNode.rollNumber +
                    ", Name: " + newNode.name + ", Age: " + newNode.age + ", Grade: " + newNode.grade);
            newNode=newNode.next;
        }
    }

}
