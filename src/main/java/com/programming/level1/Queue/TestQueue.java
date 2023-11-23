package com.programming.level1.Queue;

public class TestQueue {
    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        queue.enqueue(100);
        queue.enqueue(78);
        queue.enqueue(98);

        queue.display();

        queue.dequeue();
        queue.display();

        queue.enqueue(56);
        queue.enqueue(5);

        queue.display();

        queue.dequeue();
        queue.display();
    }
}
