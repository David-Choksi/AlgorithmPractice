public class middleNodeList{
    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public ListNode findMiddleNode(ListNode head) {
        
        // ***COMMON TECHNIQUE for handling Middle of Lists***:
        // Have 2 pointers, one steps through one node at a time. Second one steps through the list, but every other node.
        // One faster pointer reaches end, the slower is at the middle. 
        
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        
        while (fastPtr.next != null && fastPtr.next.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        
        return slowPtr;
    }
}