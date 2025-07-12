package LinkList;

public class kGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while (count < k){
            if (temp == null) return  head;
            temp=temp.next;
            count ++ ;
        }
        ListNode prev = reverseKGroup(temp , k);
          temp = head; count =0;
          while (count < k){
              ListNode next = temp.next;
              temp.next=prev;
              prev=temp;
              temp=next;
              count++;
          }
        return prev;
    }

}
