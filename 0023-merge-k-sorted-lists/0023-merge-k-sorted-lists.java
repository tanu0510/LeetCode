class Pair {
    int value;
    ListNode next;

    Pair(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.value, b.value)
        );

        for (ListNode node : lists) {
            if (node != null)
                pq.offer(new Pair(node.val, node.next));
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!pq.isEmpty()) {
            Pair pair = pq.poll();

            curr.next = new ListNode(pair.value);
            curr = curr.next;

            if (pair.next != null) {
                ListNode next = pair.next;
                pq.offer(new Pair(next.val, next.next));
            }
        }

        return dummy.next;
    }
}