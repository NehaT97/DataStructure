package com.datastructures.linkedlist;

public class Node {

    Node next;

    Integer data;

    public Node() {
    }

    public Node(Integer data, Node next) {
        this.next = next;
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return
                data +
                        " >> " + next;
    }
}
