package com.grotechminds.java;

import java.util.concurrent.atomic.AtomicInteger;

class Counter implements Runnable {
 
    // Atomic counter Variable
	//volatile Integer count = 0;
	Integer count = 0;
    //AtomicInteger count = new AtomicInteger();
 
    // method which would be called upon
    // the start of execution of a thread
    public void run()
    {
        // incrementing counter total of max times
        for (int i = 0; i < 10000; i++) {
            //count.addAndGet(1);
        	synchronized (this) {
        		count++;
        	}
        }
    }
}
 
public class AtomicCounter {
    public static void main(String[] args)
        throws InterruptedException
    {
        // Instance of Counter Class
        Counter c = new Counter();
 
        // Defining Two different threads
        Thread first = new Thread(c, "First");
        Thread second = new Thread(c, "Second");
 
        // Threads start executing
        first.start();
        second.start();
 
        // main thread will wait for both
        // threads to complete execution
        first.join();
        second.join();
 
        // Printing final value of count variable
        System.out.println(c.count);
    }
}