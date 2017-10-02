package com.problem.algorithms;

import com.problem.algorithms.help.ListNode;

/**
 * 206. Reverse Linked List
 */
public class Problem206 {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        ListNode pre = null, cur = head, temp;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public void printListNode(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        Problem206 p = new Problem206();
        p.printListNode(head);


        p.printListNode(p.reverseList(head));

    }

}
