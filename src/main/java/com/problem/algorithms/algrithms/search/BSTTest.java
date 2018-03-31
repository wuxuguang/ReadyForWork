package com.problem.algorithms.algrithms.search;

import org.junit.Before;
import org.junit.Test;

public class BSTTest {
    private BST<Character, Character> bst = new BST<Character, Character>();

    @Before
    public void init(){
        String s = "BINARYSEARCHTREE";

        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            Character value = s.charAt(i);
            bst.put(key, value);
        }
        System.out.println("init bst over.");
    }

    @Test
    public void testGetRecurisive(){
        System.out.println(bst.getRecurisive('B'));
    }


    @Test
    public void testGetNoRecurisive() {
        System.out.println(bst.getNoRecurisive('B'));
    }

}
