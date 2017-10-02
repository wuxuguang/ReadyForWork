package com.problem.algorithms;

/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 */
public class Problem96 {
    /**
     * 证明题
     *
     * 1. 假设G(n) 表示序列长度为n的BST的个数
     * 2. 假设F(i, n) 表示序列长度为n重的任意i为根节点市的BST的个数
     * 3. 那么G(n) = F(1, n) + F(2, n) + ... + F(n, n)
     * 4. 对于任意的i, F(i, n) = G(i - 1) * G(n - i)
     * 5. 所以 G(n) = G(0) * G(n - 1) + G(1) * G(n - 2) + ... + G(n) * G(0)
     * @param n
     * @return
     */
    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = G[1] = 1;
        for (int i = 2; i <= n; ++i) {
            // 计算G[i]
            for (int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
}
