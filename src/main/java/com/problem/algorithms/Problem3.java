package com.problem.algorithms;

import java.util.HashMap;

/**
 * 最长不重复子串
 * 1.用一个map存储字符和字符位置的映射关系
 * 2.用两个指针来代表子串的头和尾，移动尾指针
 * 3.当尾指针出现在 之前的map中时，需要更新头指针的位置
 *
 *
 *
 * 当发现当前遍历的字符在map中出现过时，去除这个字符在map中的值，
 */
public class Problem3 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
