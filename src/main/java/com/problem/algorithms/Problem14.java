package com.problem.algorithms;

public class Problem14 {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i))
                    return strs[0].substring(0, i);
            }
        }

        return strs[0];


    }


    public static void main(String[] args) {
        Problem14 p = new Problem14();
        String[] strs = {"abc", "abcd", "ab", "a"};

        System.out.println(p.longestCommonPrefix(strs));
    }

}

