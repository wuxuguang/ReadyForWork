package com.problem.algorithms;

import com.problem.algorithms.help.ListNode;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * Try to do this in one pass.
 */
public class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = head, end = head;
        int i = 0;
        while (i < n - 1) {
            end = end.next;
            i++;
        }

        ListNode pre = null;
        while (end.next != null){
            end = end.next;
            pre = start;
            start = start.next;
        }

        pre.next = start.next;
        return head;
    }

    public static void main(String[] args) {
        Problem19 p = new Problem19();
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);

        p.removeNthFromEnd(root, 3);


        ListNode temp = root;
        int i = 0;
        while (i < 3) {
            temp = temp.next;
            i++;
        }
        System.out.println(temp.val);
    }

}
