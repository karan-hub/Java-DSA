package LinkList;

public class CycleDetection {
         public boolean hasCycle(LL.Node head) {
             LL.Node f  = head ;
             LL.Node s  = head ;
            if(head == null) return false ;
            if(head.next == null) return false ;
            while(f !=  null && s  !=  null ){
                if(f.next != null ) f = f.next.next;
                else f = f.next;
                s=s.next ;
                if(f == s) return true ;
            }
            return false ;
        }

}
