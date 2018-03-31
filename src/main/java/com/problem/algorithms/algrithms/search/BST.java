package com.problem.algorithms.algrithms.search;

/**
 * Binary Search Tree(combine linked list and search)
 */
public class BST<Key extends Comparable<Key>, Value> {
    private Node root;

    private class Node {
        private Key key;
        private Value value;
        private Node right, left;
        int N;

        public Node(Key key, Value value, int N) {
            this.key = key;
            this.value = value;
            this.N = N;
        }
    }

    public int size() {
        return size(root);
    }

    public int size(Node x) {
        if (x == null) return 0;
        return x.N;
    }

    /**
     * Get the value of the key
     *
     * @param key
     * @return
     */
    public Value getRecurisive(Key key) {
        return getRecurisive(root, key);
    }

    public Value getNoRecurisive(Key key) {
        return getNoRecursive(root, key);
    }

    /**
     * 迭代方式获取
     * @param root
     * @param key
     * @return
     */
    public Value getRecurisive(Node root, Key key) {
        if (root == null)
            return null;
        if (root.key.compareTo(key) < 0)
            return getRecurisive(root.right, key);
        else if (root.key.compareTo(key) > 0)
            return getRecurisive(root.left, key);
        else
            return root.value;
    }

    /**
     * No Recursive to get from the BST
     *
     * @param root
     * @param key
     * @return
     */
    private Value getNoRecursive(Node root, Key key) {
        Node current = root;
        if (current == null)
            return null;
        while (current != null) {
            int cmp = key.compareTo(current.key);
            if (cmp > 0)
                current = current.right;
            else if (cmp < 0)
                current = current.left;
            else
                return current.value;
        }
        return null;
    }

    /**
     * ��key
     *
     * @param key
     * @param value
     */
    public void put(Key key, Value value) {
//        root = put(root, key, value);
        putNoRecursive(root, key, value);
    }


    private Node put(Node x, Key key, Value value) {
        if (x == null)
            return new Node(key, value, 1);
        int cmp = key.compareTo(x.key);
        if (cmp > 0)
            x.right = put(x.right, key, value);
        else if (cmp < 0)
            x.left = put(x.left, key, value);
        else
            x.value = value;
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    /**
     * No Recursive version
     *
     * @param x
     * @param key
     * @param value
     * @return
     */
    private void putNoRecursive(Node x, Key key, Value value) {
        if (x == null){
            root = new Node(key, value, 1);
            return;
        }
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp > 0) {
                if (x.right == null) {
                    x.right = new Node(key, value, 1);
                    x.N = size(x.left) + size(x.right) + 1;
                    break;
                } else
                    x = x.right;
            } else if (cmp < 0) {
                if (x.left == null) {
                    x.left = new Node(key, value, 1);
                    x.N = size(x.left) + size(x.right) + 1;
                    break;
                }else
                    x = x.left;
            } else {
                x.value = value;
                break;
            }

        }
    }


    public void preOrderTransver() {
        preOrderTransvelRe(root);
    }

    private void preOrderTransvelRe(Node root) {
        if (root == null)
            return;
        System.out.println(root.key);
        preOrderTransvelRe(root.left);
        preOrderTransvelRe(root.right);
    }


}
