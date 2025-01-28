package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class Main {
    public static void main(String[] args) {
        StudentRecord student=new StudentRecord();
         student.addAtBeg("Sachin","0191CS211142",21,"A+");
        student.addAtEnd("Sachin shukla","0191CS2111422",21,"B+");
        student.addAtPosition("rahul ","0191ME211142",21,"A+",2);


        student.displayAllRecords();

        System.out.println("search by roll number");
        student.searchByRollNumber("0191ME211142");

        System.out.println("delete by roll number");
        student.deleteByRollNumber("0191ME211142");
        System.out.println();

        student.updateGradeByRollNumber("0191CS2111422","A++");

    }

}
