package com.JavaCoreTopics;

public class ThreadsDemo implements Runnable{

    public static void main(String[] args) {
        ThreadsDemo threadsDemo = new ThreadsDemo();
        Thread thread = new Thread(threadsDemo);
    try {
    Thread.sleep(200);
    thread.start();
    } catch (InterruptedException e) {
    throw new RuntimeException(e);
    }
    }

    @Override
    public void run() {

    }
}
