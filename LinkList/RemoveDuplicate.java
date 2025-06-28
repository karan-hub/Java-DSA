package LinkList;

public class RemoveDuplicate extends  LL {
    Node node =  getHead();
    public  void removeDuplicate(Node node ){
        if (node == null) return;
        Node temp =  node;
        while (temp.next != null){
            if (temp.value == temp.next.value){
               temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }

    }
}
