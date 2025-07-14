// Last updated: 14/07/2025, 10:50:40
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
      public int getLength(ListNode head) {
            int count = 0;
            ListNode current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }

    public int getDecimalValue(ListNode head) {
        ListNode current = head;
        int cnt = getLength(head)-1;
        int sum = 0;
        
        while (current != null) {
            if(current.val == 1) sum+=(int)Math.pow(2,(current.val*cnt));
            cnt--;
            current = current.next; // Move to next node
        }

        

        return (int)sum;

        

    }
}