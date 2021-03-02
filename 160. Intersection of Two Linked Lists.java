/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //store all the nodes of one linkedlist into set
        HashSet<ListNode> set = new HashSet<>();
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }

        //compare if there is same node from the other linkedlist and the set
        while(headB != null){
            if(set.contains(headB))
                return headB;
            headB = headB.next;
        }
        //didn't find same node
        return null;
    }
}
