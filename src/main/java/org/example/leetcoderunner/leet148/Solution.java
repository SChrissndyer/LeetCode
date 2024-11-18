package org.example.leetcoderunner.leet148;

class Solution {
    public ListNode sortList(ListNode head) {
        return sortList(head, null);
    }

    private ListNode sortList(ListNode start, ListNode end) {
        if (start == null || start == end || start.next == end) {
            return start;
        }
        ListNode head = start, tail = start, node = start.next;
        boolean sorted = true;
        while (node != end) {
            ListNode next = node.next;
            if (node.val < start.val) {
                if (node.val > head.val) {
                    sorted = false;
                }
                node.next = head;
                head = node;
                tail.next = next;
            } else {
                if (node.val < tail.val) {
                    sorted = false;
                }
                tail = node;
            }
            node = next;
        }
        if (sorted) {
            return head;
        }
        ListNode start1 = sortList(head, start);
        ListNode start2 = sortList(start.next, end);
        start.next = start2;
        return start1;
    }
}