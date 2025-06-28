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
    public int CycleLen(LL.Node head) {
        LL.Node f  = head ;
        LL.Node s  = head ;
        int len= 1 ;
        if(head == null) return 0 ;
        if(head.next == null) return len ;
        while(f !=  null && s  !=  null ){
            if(f.next != null ) f = f.next.next;
            else f = f.next;
            s=s.next ;
            if(f == s){
                LL.Node p = f.next;
                while (p != s){
                    p =p.next;
                    len++;
                }
                break;
            }
        }
        return len ;
    }

}
