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
    public LL.Node detectCycle(LL.Node head) {
        if (head == null || head.next == null) return null;

        int len = CycleLen(head);
        if (len == 0) return null;

        LL.Node f = head;
        LL.Node s = head;

        while (len-- > 0) {
            s = s.next;
        }

        while (f != s) {
            f = f.next;
            s = s.next;
        }

        return f;
    }
    public int CycleLen(LL.Node head) {
        LL.Node f = head;
        LL.Node s = head;

        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;

            if (f == s) {
                int len = 1;
                LL.Node temp = f.next;
                while (temp != f) {
                    temp = temp.next;
                    len++;
                }
                return len;
            }
        }

        return 0;
    }


}
