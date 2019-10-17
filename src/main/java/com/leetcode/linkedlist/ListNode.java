package com.leetcode.linkedlist;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.val);
        ListNode cur = this;
        while (cur.next != null) {
            result.append(" => ");
            result.append(cur.next.val);
            cur = cur.next;
        }
        result.append(" => NULL");
        return result.toString();
    }
}
