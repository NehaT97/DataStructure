package com.datastructure.stack;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class MyStackTest {

    @Before
    void init(){
        System.out.println("Welcome To Stack Operation");
    }

    /*Uc1 : Create Stack Using Linked List*/
    @Test
    public void givenThreeNumbersAddedToStack_ShouldHaveLastAddedNode(){
        LinkedList linkedList = new LinkedList();
        MyStack myStack = new MyStack();
        myStack.push(70);
        myStack.push(30);
        myStack.push(56);
        myStack.printStack();
    }
}
