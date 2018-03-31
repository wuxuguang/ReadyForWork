package com.problem.algorithms;

import com.problem.algorithms.help.TreeNode;

/**
 * Subtree of Another Tree
 */
public class Problem572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;
        else if (s == null || t == null)
            return false;
        else {
            if (t.val != s.val)
                return isSubtree(s.left, t) || isSubtree(s.right, t);
            else
                return isSubtree(s.left, t) || isSubtree(s.right, t) || (isSubtree(s.right, t.right) && isSubtree(s.left, t.left));
        }
    }


    public static void main(String[] args) {
        Problem572 p = new Problem572();
        TreeNode s = new TreeNode(3);
        s.left = new TreeNode(4);
        s.left.left = new TreeNode(1);
        s.left.right = new TreeNode(2);
        s.left.right.left = new TreeNode(0);
        s.right = new TreeNode(5);

        TreeNode t = new TreeNode(4);
        t.left = new TreeNode(1);
        t.right = new TreeNode(2);

        boolean res = p.isSubtree(s, t);
        System.out.println(res);

    }
}
