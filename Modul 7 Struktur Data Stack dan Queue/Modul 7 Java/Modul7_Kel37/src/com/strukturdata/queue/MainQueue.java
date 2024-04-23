package com.strukturdata.queue;

public class MainQueue {
    public static void main(String[] args) {

        Queue queue = new Queue(4);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.peek();
        queue.count();
        queue.printQueue();

        System.out.println();

        queue.dequeue();
        queue.dequeue();
        queue.peek();
        queue.count();
        queue.printQueue();

    }
}

