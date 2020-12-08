package com.datastructure.queue;

import com.datastructures.linkedlist.LinkedList;

public class MyQueue {
    private final LinkedList linkedList;
    int front = 0, rear = 0;

    public MyQueue() {
        this.linkedList = new LinkedList();
    }

    public void enqueue(int i) {
        linkedList.add(i);
        rear++;
    }

    public boolean printQueue() {
        linkedList.display();
        return true;
    }
}
