package com.problem.algorithms;

import com.problem.algorithms.help.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Merge k Sorted Lists
 */
public class Problem23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val < o2.val)
                    return -1;
                else if (o1.val > o2.val)
                    return 1;
                else
                    return 0;
            }
        });

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;


        for (ListNode node : lists){
            if (node != null)
                queue.add(node);
        }

        while (!queue.isEmpty()) {
            tail.next = queue.poll();
            tail = tail.next;
            if (tail.next != null)
                queue.add(tail.next);
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Problem23 p = new Problem23();
        ListNode p1 = new ListNode(1);
        p1.next = new ListNode(3);
        p1.next.next = new ListNode(5);

        ListNode p2 = new ListNode(2);
        p2.next = new ListNode(4);
        p2.next.next = new ListNode(6);

        ListNode root = p.mergeKLists(new ListNode[]{p1, p2});

        while (root != null) {
            System.out.println(root.val);
            root = root.next;
        }


    }

}
