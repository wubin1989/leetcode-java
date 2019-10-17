package com.leetcode.linkedlist;

public class Question203 {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 6, 1, 2, 6, 3, 4, 5, 6, 6};
        ListNode dummyNode = new ListNode(-1);
        ListNode cur = dummyNode;
        for (int i = 0; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        System.out.println(dummyNode.next);

        System.out.println(new Question203().removeElements(dummyNode.next, 6));
    }
}
