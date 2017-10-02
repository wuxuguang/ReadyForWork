package com.problem.algorithms;

import com.problem.algorithms.help.TreeNode;

import java.util.Stack;

/**
 * Kth Smallest Element in a BST
 */
public class Problem230 {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null)
            throw new IllegalArgumentException("root is null");
        int i = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            while (root != null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            i++;
            if (i == k)
                return root.val;
            root = root.right;

        }
        throw new IllegalArgumentException("can't find the kth small element");
    }
}
