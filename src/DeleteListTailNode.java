public class DeleteListTailNode {

    public ListNode deleteAtTail(ListNode head){

        if (head == null || head.next == null){
            return head;
        }

        ListNode ptr = head;
        while (ptr.next.next != null){
            ptr = ptr.next;
        }

        ptr.next = null;

        return head;
    }

    class ListNode {

        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
        }
    }
}
