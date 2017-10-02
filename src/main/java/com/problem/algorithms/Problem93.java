package com.problem.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 */
public class Problem93 {
    public List<String> restoreIpAddresses(String s) {
        if (s == null || s.length() <= 3 || s.length() >= 13)
            return Collections.emptyList();
        int len = s.length();
        List<String> result = new ArrayList<String>();
        // ip地址的第一部分只可能为1位，2位或者3位
        for (int i = 1; i < 4 && i < len - 2; i++) {
            for (int j = i + 1; j < i + 4 && j < len - 1; j++) {
                for (int k = j + 1; k < j + 4 && k < len; k++) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k);
                    if (isValid(s1) && isValid(s2) &&isValid(s3) && isValid(s4))
                        result.add(s1 + "." + s2 + "." + s3 + "." + s4);
                }
            }
        }
        return result;
    }

    private boolean isValid(String s) {
        if (s == null || s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255)
            return false;
        return true;
    }


    public static void main(String[] args) {
        Problem93 p = new Problem93();
        String s = "25525511135";
        List<String> result = p.restoreIpAddresses(s);
        for (String t : result) {
            System.out.println(t);
        }
    }
}
