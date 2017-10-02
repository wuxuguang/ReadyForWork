package com.problem.algorithms;

/**
 * Longest Palindromic Substring
 */
public class Problem5 {
    private int lo, maxLength;


    public String longestPalindrome(String s) {
        int N = s.length();
        if (N < 2)
            return s;
        for (int i = 0; i < N - 1; i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i + 1);
        }

        return s.substring(lo, lo + maxLength);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
            j--;
            k++;
        }
        if (maxLength < k - j - 1){
            lo = k-1;
            maxLength = k - j - 1;
        }
    }

    public String dynamicLongestPalindrome(String s) {
        if (s == null || s.length() < 2)
            return s;
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int res = 0;
        String sub = null;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if ((j - i < 3 || dp[i + 1][j-1]) && s.charAt(i) == s.charAt(j))
                    dp[i][j] = true;
                if (dp[i][j] && (res == 0 || (j - i + 1) > res)) {
                    res = j - i + 1;
                    sub = s.substring(i, j + 1);
                }
            }
        }
        return sub;
    }



    public static void main(String[] args) {
        String test = "abbccbd";
        Problem5 problem5 = new Problem5();
        String result = problem5.dynamicLongestPalindrome(test);
        System.out.println(result);
    }


}
