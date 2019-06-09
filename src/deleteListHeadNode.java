import java.util.*;
import java.util.streams.*;

public class deleteListHeadNode {
    public ListNode deleteAtHead(ListNode head) {
    
        if (head == null) {
            return head;
        }
        
        head = head.next;
        return head;    
    
        
    }
}