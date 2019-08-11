import java.util.*;
import java.util.streams.*;

public class deleteListHeadNode2 {
    public ListNode deleteAtHead(ListNode head) {
    
        if (head == null) {
            return head;
        }
        ListNode tmp = head;
        
        head = head.next;

        tmp.next = null;
        return head;    
    
        
    }
}