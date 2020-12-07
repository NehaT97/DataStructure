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

    @Test
    public void LinkedListOperation_ShouldPassLinkedList_AddAndSearchOperationTest() {
        System.out.println(" Adding Elements To Linked List");
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);

        System.out.println("Uc7 Search Element");
        int searchResult = linkedList.search(70);
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, searchResult);
    }
}
