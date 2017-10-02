package com.problem.algorithms.algrithms.search;

import java.util.Random;


public class BSTTest {
    public static void main(String[] args) {
        Random random = new Random(20);
        BST<Character, Character> bst = new BST<Character, Character>();

        String s = "BINARYSEARCHTREE";

        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            Character value = s.charAt(i);
            bst.put(key, value);
        }
//        System.out.println(bst.size());
//        System.out.println(s.length());

        bst.preOrderTransver();
    }
}
