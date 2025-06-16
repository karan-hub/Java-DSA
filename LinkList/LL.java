package LinkList;

import RecursionPattern.BinarySubStrings;

public class LL {

    private  Node head ;
    private  Node tail ;
    public  int size  ;

    public  LL(){
        this.size = 0 ;
    }

    public void  inserFrist(int value){
        Node node = new Node(value) ;
        node.next = head ;
        head = node;

        if (tail ==  null)
            tail = head;

        size ++;
    }

    public void  insertLast(int value) {
        Node  node = new Node(value);
        tail.next = node ;
        tail = node ;
        if (head == null)
            head =  tail ;
        size ++ ;
    }

    public  void  display(){
        Node temp = head ;
        while (temp != null) {
            System.out.print("[" + temp.value + "] --> ");
            temp = temp.next;
        }

    }



    private  class  Node{
        private  int value ;
        Node next ;

        public  Node(int value){
            this.value = value ;
        }

        public  Node(int value , Node  next){
            this.value = value ;
            this.next = next ;
        }
    }
}
