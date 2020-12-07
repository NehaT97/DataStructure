package com.datastructures.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    int count;

    public LinkedList list() {
        return new LinkedList();
    }

    public LinkedList() {
        head = null;
        count = 0;
        tail = null;
    }

    /*Uc1 :Adding Elements in list*/
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
        count++;
    }

    /*UC4 : Inserting Element in list*/
    public boolean insert(int data, int i) {
        i = i - 1;
        if (i > count + 1) {
            //return true;
        } else if (i == 0) {
            Node temp = new Node(data, head);
            head = temp;
            count++;
        } else {
            Node temp = head;
            int count2 = 0;
            while (count2++ < i - 1) {
                temp = temp.next;
            }

            Node newNode = new Node(data, temp.next);
            temp.next = newNode;
            count++;
        }
        return true;

    }

    //UC5 : Delete First Element
    public int popFirst() {
        int data = head.data;
        Node temp = head.next;
        head.next = null;
        head = temp;
        System.out.println("Data Is Removed :" + data);
        return data;
    }

    /*UC6:Delete Last Element*/
    public int pop() {
        Node temp = head;
        Node prev = temp;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        tail = prev;
        System.out.println("Data Is Removed :" + temp.data);
        return temp.data;

    }

    /*Uc7:Searching Element In list*/
    public int search(int ele) {
        System.out.println("Finding element  : " + ele);
        int count2 = 1;
        if (head == null) {
            return -1;
        } else if (head.next == null) {
            return -1;
        } else if (head.data == ele) {
            return 0;
        } else {
            Node temp = head;
            display();

            while (temp.next != null) {
                if (temp.data.compareTo(ele) == 0) {
                    System.out.println("Element found at position : " + count2);
                    return count2;
                }
                temp = temp.next;
                count2++;
            }
            if (temp.data.compareTo(ele) == 0) {
                System.out.println("Element found at position : " + count2);
                return count2;
            }
        }
        return -1;
    }

    public void display() {
        System.out.println(head);
    }
}
