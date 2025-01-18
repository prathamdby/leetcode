/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> nodes = new ArrayList<>();

        for (ListNode node : lists)
            while (node != null) {
                nodes.add(node.val);
                node = node.next;
            }

        Collections.sort(nodes);

        ListNode dummy = new ListNode(0);
        ListNode cursor = dummy;

        for (int node : nodes) {
            cursor.next = new ListNode(node);
            cursor = cursor.next;
        }

        return dummy.next;
    }
}