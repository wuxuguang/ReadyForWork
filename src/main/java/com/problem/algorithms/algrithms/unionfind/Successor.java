package com.problem.algorithms.algrithms.unionfind;

/**
 * Successor with delete
 */
public class Successor {
    Integer[] id;

    public Successor(int N) {
        id = new Integer[N];
        for (int i = 0; i < N - 1; i++) {
            id[i] = i + 1;
        }
        id[N - 1] = -1;
    }

    public void remove(int p) {

    }
}
