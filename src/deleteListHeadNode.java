import java.util.*;
import java.util.streams.*;

public class deleteListHeadNode {
    public ListNode deleteAtHead(ListNode head) {
    
        if (head == null) {
            return head;
        }
<<<<<<< HEAD
        ListNode tmp = head;
        
        head = head.next;

        tmp.next = null;
=======
        
        head = head.next;
>>>>>>> master
        return head;    
    
        
    }
}