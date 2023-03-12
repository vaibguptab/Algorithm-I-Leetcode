package Algorithm_I;

public class Day10 {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode L1, ListNode L2) {
        if(L1 == null){
            return L2;
        }
        if(L2 == null){
            return L1;
        }
        ListNode t1 =L1 , t2 = L2;
        ListNode head =null,tail=null;
        if(t1.val<=t2.val){
            head = t1;
            tail =t1;
            t1 = t1.next;
        } else if(t1.val>t2.val){
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while(t1!= null && t2!=null){
            if(t1.val<=t2.val){
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            }else{
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        if(t1!=null){
            tail.next = t1;
        }else{
            tail.next = t2;
        }
        return head;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next==null){
            return head;
        }
        ListNode curr= head,prev=null;
        while (curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
