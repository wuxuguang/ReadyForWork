/*
package com.problem.algorithms.algrithms.stackqueue;

import edu.princeton.cs.algs4.Stack;

*/
/**
 * Using two stacks to implement one queue
 *//*

public class QueueWithStack<Item> {

    private Stack<Item> s1; // using for push
    private Stack<Item> s2; // using for pop

    public QueueWithStack() {
        s1 = new Stack<Item>();
        s2 = new Stack<Item>();
    }

    public void enqueue(Item item) {
        s1.push(item);
    }

    public Item dequeue() {
        if (s2.size() > 0)
            return s2.pop();
        else {
            while(s1.size() > 1)
                s2.push(s1.pop());
            return s1.pop();
        }
    }

    public static void main(String[] args) {
        QueueWithStack<Integer> queueWithStack = new QueueWithStack<Integer>();

        queueWithStack.enqueue(1);
        queueWithStack.enqueue(2);

        System.out.println(queueWithStack.dequeue());

        queueWithStack.enqueue(3);

        System.out.println(queueWithStack.dequeue());

        queueWithStack.enqueue(4);

        queueWithStack.enqueue(5);
        queueWithStack.enqueue(6);

        System.out.println(queueWithStack.dequeue());
        System.out.println(queueWithStack.dequeue());
        System.out.println(queueWithStack.dequeue());
        System.out.println(queueWithStack.dequeue());
        System.out.println(queueWithStack.dequeue());

    }

}
*/
