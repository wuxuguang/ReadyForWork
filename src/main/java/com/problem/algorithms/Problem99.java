package com.problem.algorithms;

import com.problem.algorithms.help.TreeNode;

/**
 * Recover Binary Search Tree
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * Recover the tree without changing its structure.
 */
public class Problem99 {

    TreeNode first = null;
    TreeNode second = null;
    TreeNode pre = new TreeNode(Integer.MIN_VALUE);

    /**
     * 中序遍历找出不符合排序条件的两个element交换即可
     *
     * @param root
     */
    public void recoverTree(TreeNode root) {

        traverse(root);

        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;

    }

    private void traverse(TreeNode root) {
        if (root == null)
            return;
        traverse(root.left);

        if (first == null && pre.val >= root.val)
            first = pre;
        if (first != null && pre.val >= root.val)
            second = root;
        pre = root;

        traverse(root.right);
    }

    public void inOrderTraverse(TreeNode root) {
        if (root == null)
            return;
        inOrderTraverse(root.left);
        System.out.println(root.val);
        inOrderTraverse(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);

        root.right = new TreeNode(3);
        root.right.right = new TreeNode(5);

        Problem99 p = new Problem99();
        p.inOrderTraverse(root);

        p.recoverTree(root);

        p.inOrderTraverse(root);

    }

}
