package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentNode {

    protected String name;
    protected String rollNumber;
    protected double age;
    protected String grade;
    StudentNode next;
    public StudentNode(String name,String rollNumber,double age,String grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }
}
