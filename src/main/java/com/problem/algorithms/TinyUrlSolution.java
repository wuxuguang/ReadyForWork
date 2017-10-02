package com.problem.algorithms;

import java.util.HashMap;

/**
 * 设计短连接
 */
public class TinyUrlSolution {
    HashMap<String, Integer> ltos;
    HashMap<Integer, String> stol;
    static int COUNTER;
    String elements;
    TinyUrlSolution() {
        ltos = new HashMap<String, Integer>();
        stol = new HashMap<Integer, String>();
        COUNTER = 1;
        elements = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }

    public String longToShort(String url) {
        String shortUrl = base10ToBase62(COUNTER);
        ltos.put(url, COUNTER);
        stol.put(COUNTER, url);
        COUNTER++;
        return "http://tiny.url/" + shortUrl;
    }

    public String shortToLong(String shortUlr) {
        shortUlr = shortUlr.substring("http://tiny.url/".length());
        int id = base62To10(shortUlr);
        return stol.get(id);
    }


    /**
     * 62进制数转化成十进制数
     * @param shortUrl
     * @return
     */
    public int base62To10(String shortUrl) {
        int result = 0;
        for (int i = 0; i< shortUrl.length(); i++) {
            result += result*62 + elements.indexOf(shortUrl.charAt(i));
        }
        return result;
    }


    /**
     * 62进制数转化成十进制数
     * @param shortUrl
     * @return
     */
    public int base62To102(String shortUrl) {
        int result = 0;
        for (int i = 0; i< shortUrl.length(); i++) {
            result += result*62 + convert(shortUrl.charAt(i));
        }
        return result;
    }


    public int convert(char c) {
        if (c >= '0' && c <= '9')
            return c - '0';
        if (c >= 'a' && c <= 'z') {
            return c - 'a' + 10;
        }
        if (c >= 'A' && c <= 'Z') {
            return c - 'A' + 36;
        }
        return -1;
    }

    /**
     * 十进制转化成62进制数
     * @param n 十进制数
     * @return 62进制数，用String来表示
     */
    public String base10ToBase62(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.insert(0, elements.charAt(n % 62));
            n /= 62;
        }
        while (sb.length() != 6) {
            sb.insert(0, '0');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        TinyUrlSolution t = new TinyUrlSolution();
        System.out.println(t.base62To10("abcd$"));
        System.out.println(t.base62To102("abcd#"));
    }

}
