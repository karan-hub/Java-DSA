package LinkList;

public class palindrom {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = getMidPos(head);
        ListNode secHead = reverseList(mid);
        ListNode first =  head ;
        while (first != null && secHead != null){
            if (first.val != secHead.val) return false;
            first = first.next;
            secHead= secHead.next;
        }
        return  true;

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
