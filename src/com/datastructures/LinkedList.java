package com.datastructures;

import java.util.Objects;

public class LinkedList {

    private Node head;

    private Node tail;

    public LinkedList list() {
        return new LinkedList();
    }

    public void add(Integer data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
        } else {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        System.out.println(head);
    }

}
