package Algorithm_I;

public class Day5 {
    public static void main(String[] args) {

    }
//    }
//    public ListNode middleNode(ListNode head1) {
//
//        if(head1==null||head1.next==null){
//            return head1;
//        }
//        ListNode slow = head1,fast =head1.next;
//        while (fast.next!=null && fast.next.next!=null && fast!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow.next;
//    }
//
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode start = new ListNode(0);
//        ListNode slow = start, fast = start;
//        slow.next = head;
//
//        //Move fast in front so that the gap between slow and fast becomes n
//        for(int i=1; i<=n+1; i++)   {
//            fast = fast.next;
//        }
//        //Move fast to the end, maintaining the gap
//        while(fast != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//        //Skip the desired node
//        slow.next = slow.next.next;
//        return start.next;
//    }
}
