package LinkList;

public class reorder {
    public void reorderList(ListNode head) {
       if (head == null || head.next == null) return;

       ListNode  midPoint = getMidPos(head);
       ListNode newHead = reverseList(midPoint);
       ListNode oldHead = head;
       while (oldHead != null && newHead != null){
           ListNode temp =oldHead.next;
           oldHead.next=newHead;
           oldHead=temp;

           temp = newHead.next;
           newHead.next = oldHead;
           newHead=temp;
       }
       if (oldHead!=null){
           oldHead.next=null;
       }

    }
    public ListNode getMidPos(ListNode head){
        ListNode fast = head ;
        ListNode slow = head ;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null ||head.next == null) return head;
        return helper(head);
    }
    ListNode tail = new ListNode() ;
    ListNode newHead = null;
    private ListNode helper(ListNode head) {

        if (head.next == null){
            tail = head ;
            newHead = tail;
            return head;
        }
        helper(head.next);
        tail.next = head ;
        tail = tail.next;
        tail.next= null;
        return newHead;

    }
}
