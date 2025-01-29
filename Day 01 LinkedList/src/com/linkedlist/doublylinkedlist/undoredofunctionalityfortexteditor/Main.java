package com.linkedlist.doublylinkedlist.undoredofunctionalityfortexteditor;

public class Main {
    public static void main(String[] args) {
        UndoRedoFunctionality editor = new UndoRedoFunctionality();

        // Simulating actions
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World!!");

        // Display current state
        editor.displayCurrentState();

        // Perform undo
        editor.undo();
        editor.undo();

        // Perform redo
        editor.redo();

        // Add a new state (clears redo history)
        editor.addState("Hello Java!");

        // Display all states
        editor.displayAllStates();

        // Perform undo
        editor.undo();

        // Display current state
        editor.displayCurrentState();
    }

}
