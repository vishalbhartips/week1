package org.ps;

import java.util.*;

public class SynchronizedExample {
}

class Counter {
    private int counter = 0;
    private Object lock = new Object();

    public void incrementCounter() {
        synchronized(lock) {
            counter++;
        }
    }

    public int getCounter() {
        synchronized(lock) {
            return counter;
        }
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counterObj = new Counter();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            Thread t = new Thread(() -> {
                counterObj.incrementCounter();
            });
            threads.add(t);
            t.start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println(counterObj.getCounter()); // Output should be 100000
    }
}
