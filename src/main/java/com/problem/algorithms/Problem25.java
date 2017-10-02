package com.problem.algorithms;

import com.problem.algorithms.help.ListNode;

/**
 * Reverse Nodes in k-Group
 */
public class Problem25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy, end = dummy;
        int i = 0;

        while (end.next != null) {
            i++;
            end = end.next;
            if (i % k == 0) {
                ListNode nextStart = start.next, endBenchMark = end.next;
                ListNode pre = end.next, s = start.next;
                ListNode temp;
                while (s != endBenchMark) {
                    temp = s.next;
                    s.next = pre;
                    pre = s;
                    s = temp;
                }
                start.next = pre;
                start = nextStart;
                end = nextStart;
            }
        }

        return dummy.next;

    }

    public static void main(String[] args) {
        Problem25 p = new Problem25();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);
        node.next.next.next.next.next.next = new ListNode(7);
        node.next.next.next.next.next.next.next = new ListNode(8);

        ListNode res = p.reverseKGroup(node, 4);

        res.printAll();


    }

}
