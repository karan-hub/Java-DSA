package LinkList;

public class Mearge extends  LL{
    public LL meargeLists(LL list1 , LL list2){
        if (list1 == null && list2 == null ) return  null ;
        else if (list1 == null) return list2 ;
        else  if (list2 == null) return list1 ;

        Node f = list1.getHead() ;
        Node s = list2.getHead();
        Mearge m = new Mearge();
         while (f != null && s  != null){
            if (f.value > s.value){
                m.inserFrist(f.value);
                f = f.next;
            }else {
                m.inserFrist(s.value);
                s = s.next;
            }
        }
         while ( f != null ){
             m.inserFrist(f.value);
             f = f.next;
         }
         while (s != null){
             m.inserFrist(s.value);
             s = s.next;
         }

      return  m;
    }
}
