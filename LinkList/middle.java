package LinkList;

public class middle {
    public LL.Node middleNode(LL.Node head) {
        LL.Node fast =  head ;
        LL.Node mid = head ;
        if(head == null || head.next == null )  return head ;
        while(fast !=  null  && fast.next != null){
            fast = fast.next.next;
            mid  = mid.next;
        }
        return mid ;
    }
}
