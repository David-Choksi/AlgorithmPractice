import java.util.LinkedList;

public class DeleteListHeadNode1 {

    public ListNode deleteAtHead(ListNode head){

        if (head == null){
            return head;
        }

        head = head.next;
        return head;
    }
}

class ListNode {

    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
    }
}
