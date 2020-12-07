package com.datastructures.linkedlist;

public class GetRun {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("\nFirst List");
        linkedList.add(56);
        linkedList.add(70);
        linkedList.add(30);
        linkedList.display();

        LinkedList linkedList2 = new LinkedList();
        System.out.println("\nSecond List");
        linkedList2.add(70);
        linkedList2.add(30);
        linkedList2.add(56);
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

        System.out.println("\nList 3 pop Result");
        linkedList3.pop();
        linkedList3.display();

        linkedList4.search(56);
    }
}
