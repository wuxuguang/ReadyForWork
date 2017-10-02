package com.problem.algorithms;

/**
 * Palindrome Number
 */
public class Problem9 {
    public boolean isPalindrome(int x) {
        if (x < 0 )
            return false;
        double result = 0;
        int temp = x;
        while (x != 0){
            result = result * 10 + x % 10;
            if (result > Integer.MAX_VALUE)
                return false;
            x = x /10;
        }
        return ((int)result) == temp;
    }


    public static void main(String[] args) {
        Problem9 p = new Problem9();
        System.out.println(p.isPalindrome(3));
    }
}
