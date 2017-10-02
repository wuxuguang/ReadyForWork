/*
package com.problem.algorithms.algrithms.unionfind;

import com.problem.algorithms.algrithms.unionfind.Percolation;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    private double mean;
    private double stddev;
    private double confidenceLo;
    private double confidenceHi;

    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0)
            throw new IllegalArgumentException("The input argument is illegal");
        double[] temp = new double[trials];
        for (int i = 0; i < trials; i++) {
            Percolation p = new Percolation(n);
            while (!p.percolates()) {
                int row = StdRandom.uniform(n) + 1;
                int col = StdRandom.uniform(n) + 1;
                p.open(row, col);
            }
            temp[i] = p.numberOfOpenSites() / n * n;
        }
        mean = StdStats.mean(temp);
        stddev = StdStats.stddev(temp);
        confidenceLo = mean - 1.96 * stddev / Math.sqrt(trials);
        confidenceHi = mean + 1.96 * stddev / Math.sqrt(trials);

    }    // perform trials independent experiments on an n-by-n grid

    public double mean() {
        return mean;
    }                          // sample mean of percolation threshold

    public double stddev() {
        return stddev;
    }                        // sample standard deviation of percolation threshold

    public double confidenceLo() {
        return confidenceLo;
    }                  // low  endpoint of 95% confidence interval

    public double confidenceHi() {
        return confidenceHi;
    }                  // high endpoint of 95% confidence interval

    public static void main(String[] args) {

    }       // test client (described below)
}
*/
