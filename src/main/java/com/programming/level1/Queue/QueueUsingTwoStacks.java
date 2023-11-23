package com.programming.level1.Queue;

import java.util.Stack;

//what is queue?
/*
A queue is a data structure that follows the First In, First Out (FIFO) principle, which means that the
first element added to the queue will be the first one to be removed. It operates like a real-world queue or line,
where people join at the end and the person who arrives first is the first to be served or processed.
*/


public class QueueUsingTwoStacks {
        //these both variable has Stack<Inger> data type
        private Stack<Integer> stack1; // Stack for enqueue operation
        private Stack<Integer> stack2; // Stack for dequeue operation

    //this constructor initialize the both stack1 and stack2 as the new Instance of Stack class
        public QueueUsingTwoStacks() {
            this.stack1 = new Stack<>();
            this.stack2 = new Stack<>();
        }

        // Method to enqueue (insert) an element into the queue
        public void enqueue(int x) {
            stack1.push(x); // Push the element onto stack1 (enqueue operation)
            System.out.println("Enqueued: " + x);
        }

        // Method to dequeue (remove) an element from the queue
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return;
            }

            // If stack2 is empty, transfer elements from stack1
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop()); // Move elements from stack1 to stack2
                }
            }

            int dequeuedValue = stack2.pop(); // Pop the front element from stack2 (dequeue operation)
            System.out.println("Dequeued: " + dequeuedValue);
        }

        // Method to check if the queue is empty
        public boolean isEmpty() {
            // Queue is empty if both stack1 and stack2 are empty
            return stack1.isEmpty() && stack2.isEmpty();
        }

        // Method to display the elements of the queue
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }

            System.out.print("Queue: ");
            // Display elements in stack2 (front of the queue)
            for (int i : stack2) {
                System.out.print(i + " ");
            }

            // Display elements in stack1 in reverse order (rear of the queue)
            for (int i = stack1.size() - 1; i >= 0; i--) {
                System.out.print(stack1.get(i) + " ");
            }

            System.out.println();
        }





}
