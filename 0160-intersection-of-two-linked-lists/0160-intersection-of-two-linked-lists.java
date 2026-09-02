public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;

        ListNode tempA = headA;
        ListNode tempB = headB;

        // Find length of A
        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }

        // Find length of B
        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }

        // Move longer list ahead
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }

        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // Find intersection
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}