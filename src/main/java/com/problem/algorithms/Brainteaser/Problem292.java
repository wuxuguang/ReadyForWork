package com.problem.algorithms.Brainteaser;

public class Problem292 {

    public boolean canWinNim(int n) {
        return (n % 4 != 0);
    }

    public static void main(String[] args) {
        Problem292 p = new Problem292();
        System.out.println(p.canWinNim(42));
    }
}
