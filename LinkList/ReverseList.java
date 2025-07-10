package LinkList;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null ||head.next == null) return null;
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

    public ListNode  reverce(ListNode head){
        if (head == null || head.next == null ) return  head ;
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;

    }

    public static void main(String[] args) {
        ReverseList obj = new ReverseList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode reversed = obj.reverce(head);
//    printList(reversed);


        ListNode head5 = buildList(new int[]{1, 2, 2,1});
        head5 = reverseBetween(head5, 3, 4);
        printList(head5);
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) return head;
        ListNode prev =  null;
        ListNode curr =  head ;
        for (int i =0 ; curr !=  null && i < left-1 ;i++){
            prev = curr ;
            curr =curr.next;
        }
        ListNode newEnd = curr;
        ListNode next = curr.next;
        ListNode temp = null;
        for ( int i = 0 ; i < right-left+1 ; i++){
            curr.next = temp;
            temp =curr;
            curr = next;
            if (next != null){
                next = next.next;
            }
        }
        if (prev != null) {
            prev.next = temp;
        } else {
            head = temp;
        }

        newEnd.next = curr;


        return head ;
    }

    public static ListNode buildList(int[] vals) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : vals) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }
}