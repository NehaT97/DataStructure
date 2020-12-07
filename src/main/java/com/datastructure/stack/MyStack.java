package com.datastructure.stack;

import com.datastructures.linkedlist.LinkedList;

public class MyStack {

    private final LinkedList linkedList;

    public MyStack() {
        this.linkedList = new LinkedList();
    }

    public void push(){
        linkedList.add(20);
    }
}
