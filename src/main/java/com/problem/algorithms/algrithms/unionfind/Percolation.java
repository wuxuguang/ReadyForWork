/*
package com.problem.algorithms.algrithms.unionfind;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

*/
/**
 * 浸透问题
 * 问题描述：给定一个由绝缘体和金属所组成的系统，多少部分是金属可以使得这个系统也是一个导体；
 * <p/>
 * 建模：给定一个N*N的方格，每个方格要么是OPEN，要么是BLOCKED。“A Full Site”是指最高行的一个open site可以通过相邻（上、下、左、右）的site chain来连接到最低行的一个open site。
 *//*

public class Percolation {

    private boolean[][] sites;
    private int grid;
    private int beginNode;
    private int endNode;
    private int opensites;

    private WeightedQuickUnionUF qu;
    private WeightedQuickUnionUF backwash;

    // create n-by-n grid, with all sites blocked
    public Percolation(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("the number is illegal");
        opensites = 0;
        grid = n;
        qu = new WeightedQuickUnionUF(n * n + 1);
        backwash = new WeightedQuickUnionUF(n * n + 2);
        sites = new boolean[n][n];
        beginNode = 0;
        endNode = n * n + 1;
    }


    private void checkException(int i, int j) {
        if (i <= 0 || i > grid || j <= 0 || j > grid)
            throw new IndexOutOfBoundsException("row index i out of bounds");
    }

    private int indexCalc(int row, int col) {
        return col + grid * (row - 1);
    }


    public void open(int row, int col) {
        checkException(row, col);
        int i = row - 1;
        int j = col - 1;
        if (!sites[i][j]) {
            sites[i][j] = true;
            opensites++;
        }
        int index = indexCalc(row, col);
        // left:
        if (col != 1) {
            if (sites[i][j - 1]) {
                qu.union(index, index - 1);
                backwash.union(index, index - 1);
            }
        }
        // right:
        if (col != grid) {
            if (sites[i][j + 1]) {
                qu.union(index, index + 1);
                backwash.union(index, index + 1);
            }
        }
        // top:
        if (row != 1) {
            if (sites[i - 1][j]) {
                qu.union(index, indexCalc(row - 1, col));
                backwash.union(index, indexCalc(row - 1, col));
            }
        } else {
            qu.union(beginNode, index);
            backwash.union(beginNode, index);
        }
        // bottom:
        if (row != grid) {
            if (sites[i + 1][j]) {
                qu.union(index, indexCalc(row + 1, col));
                backwash.union(index, indexCalc(row + 1, col));
            }
        } else {
            backwash.union(index, endNode);
        }
    }


    public boolean isOpen(int i, int j) {
        checkException(i, j);
        // is site (row i, column j) open?
        return sites[i - 1][j - 1];
    }

    public boolean isFull(int i, int j) {
        checkException(i, j);
        // is site (row i, column j) full?
        return (qu.connected(indexCalc(i, j), beginNode));
    }


    public boolean percolates() {
        return backwash.connected(beginNode, endNode);
    }

    public int numberOfOpenSites() {
        return opensites;
    }

    public static void main(String[] args) {

    }
}
*/
