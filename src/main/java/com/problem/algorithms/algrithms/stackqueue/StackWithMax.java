/*
package com.problem.algorithms.algrithms.stackqueue;

import edu.princeton.cs.algs4.Stack;

*/
/**
 * Using two stacks to implement the StackWithMax
 *//*

public class StackWithMax<T extends Comparable> {

    private Stack<T> s1;
    private Stack<T> s2;

    public StackWithMax() {
        s1 = new Stack<T>();
        s2 = new Stack<T>();
    }

    public void push(T t) {
        s1.push(t);
        if (s2.isEmpty() || t.compareTo(s2.peek()) >= 0)
            s2.push(t);
    }

    public void pop() {
        if (s1.pop() == s2.peek())
            s2.pop();
    }

    public T max() {
        return s2.peek();
    }

    public static void main(String[] args) {
        StackWithMax<Integer> stackWithMax = new StackWithMax<Integer>();


        stackWithMax.push(4);
        stackWithMax.push(1);

        System.out.println(stackWithMax.max());

        stackWithMax.pop();

        System.out.println(stackWithMax.max());

        stackWithMax.push(5);

        stackWithMax.push(3);

        System.out.println(stackWithMax.max());
    }
}
*/
