public class SinglePassMiddleList {

    public static ListNode findMiddleNode(ListNode head){

        /*
        //Two passes way - One pass finds length, second returns middle node
        int length = 0;
        int ctr = 0;
        int half = 0;
        ListNode ptr = head;

        //first pass finds length
        while (ptr.next != null){
            length++;
            ptr = ptr.next;
        }

        //sets ptr back to head
        ptr = head;

        half = (int) Math.ceil(length / 2);

        //second pass goes until ctr = half, then return node at ptr
        while (ctr != half){
            ptr = ptr.next;
            ctr++;
        }

        return ptr; */

        if (head == null){
            return null;
        }

        ListNode ptrSonic = head;
        ListNode ptrSnail = head;


        while (ptrSonic.next != null && ptrSonic.next.next != null){

            ptrSnail = ptrSnail.next;
            ptrSonic = ptrSonic.next.next;
        }

        return ptrSnail;

    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(7);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(10);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;


        System.out.println(findMiddleNode(node1).data);
    }


}


