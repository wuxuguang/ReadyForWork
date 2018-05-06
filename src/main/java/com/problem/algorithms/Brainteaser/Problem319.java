package com.problem.algorithms.Brainteaser;

public class Problem319 {
    public int bulbSwitch(int n) {
        return (int) Math.sqrt((double) n);
    }

    public static void main(String[] args) {
        Problem319 p = new Problem319();
        System.out.println(p.bulbSwitch(8));
    }
}
