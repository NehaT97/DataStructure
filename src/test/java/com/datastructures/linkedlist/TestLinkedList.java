package com.datastructures.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLinkedList {
    LinkedList linkedList = new LinkedList();

    @Before
    public void init() {
        System.out.println("Welcome to linked list");
    }

    /*Uc7: */
    @Test
    public void LinkedListOperation_ShouldPassLinkedList_AddAndSearchOperationTest() {
        System.out.println(" Adding Elements To Linked List");
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);

        System.out.println("\nSearch Element using test Case");
        int searchResult = linkedList.search(70);
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, searchResult);
    }

    /*Uc8: */
    @Test
    public void LinkedListOperation_ShouldPassLinkedList_InsertOperationTest() {
        System.out.println("\nInsert element at particular index Using  Test Case ");
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(56);
        linkedList1.add(30);
        linkedList1.add(70);
        boolean result = linkedList1.insert(40,3);
        Assert.assertTrue(result);
        linkedList1.display();
    }
}
