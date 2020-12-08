package com.datastructure.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyStackTest {

    @Before
    public void init() {
        System.out.println("Welcome To Stack Operation");
    }

    /*Uc1 : Create Stack Using Linked List*/
    @Test
    public void givenThreeNumbersAddedToStack_ShouldHavePerformPeakPopOperation() {
        MyStack myStack = new MyStack();
        myStack.push(70);
        myStack.push(30);
        myStack.push(56);
        myStack.printStack();

        /*Uc2 :Peak Operation*/
        System.out.println("\nPeak Operation:");
        int result = myStack.peak();
        int expectedResult = 56;
        Assert.assertEquals(expectedResult, result);
        System.out.println(result);

        /*Pop Operation*/
        System.out.println("\nPop Operation");
        boolean resultPop = myStack.pop();
        Assert.assertTrue(resultPop);
    }

}

