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
    public ListNode detectCycle(ListNode head) {
       if(head == null)
           return null;
        ListNode intersection = isCycle(head);
       if(intersection == null)
           return null;
       ListNode partA = head;
       ListNode partB = intersection;

       while(partA != partB){
           partA = partA.next;
           partB = partB.next;
       }
       return partA;

   }
   public ListNode isCycle(ListNode head){
       ListNode slow = head;
       ListNode fast = head;

       while(fast.next != null && fast.next.next != null){
           fast = fast.next.next;
           slow = slow.next;

           if(slow == fast)
               return slow;
       }


       return null;

   }
}
