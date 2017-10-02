package com.problem.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Generate Parentheses
 */
public class Problem22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
//        backtrack(list, "", 0, 0, n);
        addingLeftOrRight(list, "", n, 0);
        return list;
    }


    public void addingLeftOrRight(List<String> list, String res, int left, int right) {
        if (left == 0 && right == 0){
            list.add(res);
            return;
        }

        if (left > 0)
            addingLeftOrRight(list, res + "(" , left - 1, right + 1);
        if (right > 0)
            addingLeftOrRight(list, res + ")", left, right - 1);
    }

    public void backtrack(List<String> list, String str, int open, int close, int max){

        if(str.length() == max*2){
            list.add(str);
            return;
        }

        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }




    public static void main(String[] args) {
        Problem22 p = new Problem22();
        List<String> res = p.generateParenthesis(3);
        for (String s : res)
            System.out.println(s);
    }

}
