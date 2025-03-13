// https://leetcode.com/problems/linked-list-cycle/solutions/6476152/floyd-s-cycle-detection-tortoise-hare-simple-efficient/?envType=study-plan-v2&envId=top-interview-150

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        Set<ListNode> visited = new HashSet<>();
        while (current != null) {
            if (visited.contains(current)) {
                return true;
            } else {
                visited.add(current);
            }
            current = current.next;
        }
        return false;
    }
}
