//package com.problem.algorithms.algrithms.unionfind;
//
//import com.google.common.base.Joiner;
//
//import java.util.Arrays;
//
///**
// * Union-Find Test
// */
//public class TestUnionFind {
//    public static void main(String[] args) {
//        UnionFind uf = new UnionFind(10);
//        System.out.println(Joiner.on(" ").join(Arrays.asList(uf.id)));
//        System.out.println(Joiner.on(" ").join(Arrays.asList(uf.id)));
//
//        uf.union(0, 3);
//        uf.union(1, 2);
//        uf.union(4, 7);
//        uf.union(5, 8);
//        uf.union(6, 3);
//        uf.union(9, 6);
//        uf.union(3, 6);
///*        uf.union(1, 0);
//        uf.union(4, 1);
//        uf.union(5, 2);*/
//
//        System.out.println(Joiner.on(" ").join(Arrays.asList(uf.id)));
//
//        System.out.println(uf.max[5]);
//    }
//}
