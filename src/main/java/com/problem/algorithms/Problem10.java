package com.problem.algorithms;

/**
 * Regular Expression Matching
 *
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 */
public class Problem10 {

    public boolean isMatch(String s, String p) {
        if (p == null || p.length() == 0)
            return s.length() == 0;
        if (p.length() == 1) {
            return (s.length() == 1 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));
        }
        if (p.charAt(1) != '*') {
            if (s.length() == 0)
                return false;
            return (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') && isMatch(s.substring(1), p.substring(1));
        }
        while (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
            if (isMatch(s, p.substring(2))) return true;
            s = s.substring(1);
        }
        return isMatch(s, p.substring(2));
    }

    public static void main(String[] args) {
        Problem10 p = new Problem10();
        System.out.println(p.isMatch("abbbbb", "ab*"));
    }

}
