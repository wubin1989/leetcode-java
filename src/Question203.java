/**
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
class Question203 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append(this.val + ", ");
            ListNode next = this.next;
            while (next != null) {
                result.append(next.val);
                if (next.next != null) {
                    result.append(", ");
                }
                next = next.next;
            }
            return result.toString();
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new Question203.ListNode(-1);
        dummyNode.next = head;
        ListNode cur = dummyNode;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 6, 3, 4, 5, 6};
        ListNode head = new Question203.ListNode(input[input.length - 1]);
        for (int i = input.length - 1 - 1; i >= 0; i--) {
            ListNode node = new Question203.ListNode(input[i]);
            node.next = head;
            head = node;
        }

        System.out.println(head);


        head = new Question203().removeElements(head, 6);

        System.out.println(head);
    }
}