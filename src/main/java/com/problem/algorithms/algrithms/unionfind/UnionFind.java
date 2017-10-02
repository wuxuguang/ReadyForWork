package com.problem.algorithms.algrithms.unionfind;

/**
 * Union Find Problem
 */
public class UnionFind {
    Integer id[];
    int sz[];
    int max[];

    Integer cs; //表示连通分量的个数（component size）


    public UnionFind(int N) {
        cs = N;
        id = new Integer[N];
        sz = new int[N];
        max = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
            max[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i])
            i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public int delete(int p) {
        if (p == id.length - 1)
            return p;
        union(p, p + 1);
        return find(p);
    }

    public int find(int p) {
        return max[root(p)];
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        int maxi = find(p);
        int maxj = find(q);
        if (i == j)
            return;
        cs--;
        if (sz[i] < sz[j]){
            id[i] = j;
            sz[j] += sz[i];
            max[j] = Math.max(maxi, maxj);
        }else {
            id[j] = i;
            sz[i] += sz[j];
            max[i] = Math.max(maxi, maxj);
        }
    }

}
