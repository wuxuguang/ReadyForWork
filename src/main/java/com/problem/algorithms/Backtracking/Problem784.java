package com.problem.algorithms.Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Letter Case Permutation
 */
public class Problem784 {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<String>();
        Map<Integer, Character> map = new HashMap<Integer, Character>();
        char[] temp = new char[S.length()];
        for (int i = 0; i < S.length(); i++) {
            char a = S.charAt(i);
            if (a >= 'a' && a <= 'z')
                map.put(i, a);
            else if(a >= 'A' && a <= 'Z')
                map.put(i, (char) (a - 'A' + 'a'));
            else
                temp[i] = a;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println('A' - 'a'  + 'B');
    }
}
