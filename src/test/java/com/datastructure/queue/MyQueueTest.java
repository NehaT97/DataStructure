package com.datastructure.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyQueueTest {
    @Before
    public void init() {
        System.out.println("Welcome To Queue Operation");
    }

    /* Uc3: Create Queue */
    @Test
    public void givenThreeNumbersAddedToQueue_ShouldHavePassCreateQueue() {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(56);
        myQueue.enqueue(70);
        myQueue.enqueue(30);
        boolean result = myQueue.printQueue();
        Assert.assertTrue(result);

    }

}
