package com.linkedlist.doublylinkedlist.undoredofunctionalityfortexteditor;

public class TextStateNode {
        String textState;
        TextStateNode prev;
        TextStateNode next;

        // Constructor
        public TextStateNode(String textState) {
            this.textState = textState;
            this.prev = null;
            this.next = null;
        }
    }

