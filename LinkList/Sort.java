package LinkList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Sort {


    public ListNode sortList(ListNode head) {
        if(head == null || head.next ==  null ) return  head ;
        ListNode mid =  getMid(head);
        ListNode right = sortList(mid);
        ListNode left = sortList(head);
        return  Merge(right , left);
    }
    public ListNode Merge(ListNode right ,ListNode left ) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead ;
        while(right != null && left != null ){
            if(right.val < left.val){
                tail.next = right;
                right = right.next;
                tail=tail.next;
            }else{
                tail.next = left;
                left = left.next;
                tail=tail.next;
            }
        }
        tail.next = (right != null) ? right : left;
        return dummyHead.next;
    }

    public ListNode getMid(ListNode head) {
        ListNode midprev = null;
        while(head != null && head.next != null){
            midprev = (midprev == null) ? head : midprev.next;
            head = head.next.next;
        }
        ListNode mid = midprev.next;
        midprev.next =null;
        return mid ;
    }

}
