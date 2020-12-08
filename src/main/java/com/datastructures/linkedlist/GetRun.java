package com.datastructures.linkedlist;

public class GetRun {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("Elements Added");
        linkedList.add(56);
        linkedList.add(70);
        linkedList.add(30);
        linkedList.display();

        LinkedList linkedList2 = new LinkedList();
        System.out.println("\nSecond List");
        linkedList2.add(70);
        linkedList2.add(30);
        linkedList2.add(56);
        linkedList2.peakLastElement();
        linkedList2.display();

        LinkedList linkedList3 = new LinkedList();
        System.out.println("\nThird List");
        linkedList3.add(56);
        linkedList3.add(30);
        linkedList3.add(70);
        linkedList3.display();

        LinkedList linkedList4 = new LinkedList();
        System.out.println("\nFourth List");
        linkedList4.add(56);
        linkedList4.add(70);
        linkedList4.insert(30, 2);
        linkedList4.display();

        System.out.println("\nList 2 pop Result");
        linkedList2.popFirst();
        linkedList2.display();

        System.out.println("\nList 5 pop Result");
        LinkedList linkedList5 = new LinkedList();
        linkedList5.add(10);
        linkedList5.add(20);
        linkedList5.add(30);
        linkedList5.add(40);
        linkedList5.add(50);
        linkedList5.Pop();
        linkedList5.display();

        // linkedList4.search(56);

    }
}
