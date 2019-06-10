import java.util.*;
import java.util.streams.*;

public class deleteListTailNode2 {
    public ListNode deleteAtTail(ListNode head) {
    
        if (head == null || head.next == null) {
            return null;
        }
        
        ListNode cursor = head;
        
        while (cursor.next.next != null) {
            cursor = cursor.next;
        }
        
        cursor.next = null;
        
        return head; 
        
    }
}