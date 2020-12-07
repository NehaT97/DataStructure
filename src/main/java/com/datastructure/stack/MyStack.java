package com.datastructure.stack;

import com.datastructures.linkedlist.LinkedList;

public class MyStack {

    private final LinkedList linkedList;

    public MyStack() {
        this.linkedList = new LinkedList();
    }

    public void push(int i) {
        linkedList.add(i);

    }

    public void printStack() {
        linkedList.display();
    }

    public int peak() {
        return linkedList.peakLastElement();
    }

    public void pop() {
    }
}
