package org.ps;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter3 {
    private int counter = 0;
    private Lock lock = new ReentrantLock();

    public void incrementCounter() {
        lock.lock();
        try {
            counter++;
            incrementAgain();
        } finally {
            lock.unlock();
        }
    }

    public void incrementAgain() {
        lock.lock();
        try {
            counter++;
        } finally {
            lock.unlock();
        }
    }

    public int getCounter() {
        lock.lock();
        try {
            return counter;
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter3 counterObj3 = new Counter3();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            Thread t = new Thread(() -> {
                counterObj3.incrementCounter();
            });
            threads.add(t);
            t.start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println(counterObj3.getCounter()); // Output should be 20000
    }
}
