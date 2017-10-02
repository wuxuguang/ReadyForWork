package com.problem.algorithms;

/**
 * String to Integer
 */
public class Problem8 {

    public int myAtoi(String str) {
        if(str == null || str.length() == 0)
            return 0;
        int i = 0;
        long result = 0;
        boolean neg = false;
        if(str.charAt(i) == '+' || str.charAt(i) == '-'){
            if(str.charAt(i) == '-')
                neg = true;
            i++;
        }
        while(i < str.length()){
            int tmp = str.charAt(i) - '0';
            if(tmp < 0 || tmp > 9)
                break;
            result = result*10 + tmp;
            if(!neg && result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (neg && -result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }
        if(neg)
            result = -result;
        return (int)result;
    }

    public static void main(String[] args) {
        Problem8 p = new Problem8();
        p.myAtoi("-1");
    }

}
