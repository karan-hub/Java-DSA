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
        if (tail == null){
            inserFrist(value);
            return;
        }

        Node  node = new Node(value);
        tail.next = node ;
        tail = node ;

        size ++ ;
    }

    public  void  display(){
        Node temp = head ;
        while (temp != null) {
            System.out.print("[" + temp.value + "] --> ");
            temp = temp.next;
        }

    }

    public  void  insertAt(int value , int idx){
        if (idx == 0){
            inserFrist(value);
            return;
        } else if (idx == size) {
            insertLast(value);
            return;
        }

        int currentIdx = 1 ;
        Node currentNode = head ;
        while (currentIdx < idx) {
            try{
                currentNode =  currentNode.next;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                return;
            }
            currentIdx ++;
        }
        Node  node  = new Node(value , currentNode.next);
        currentNode.next  = node ;
        size ++ ;
    }

    public  int deletFrist(){
        int value = head.value ;
        head = head.next ;
        if (head == null)
            tail = null;
        size--;
        return value ;
    }

    public  int deletAt(int idx){
        Node  currentNode = head ;
        for (int i = 1; i < idx; i++)
            currentNode=  currentNode.next;
        int value=  currentNode.next.value ;
        currentNode.next = currentNode.next.next;
        return  value;
    }

    public  int deletLast(){
        Node  currentNode = head ;
        for (int i = 1; i < size-2; i++)
            currentNode=  currentNode.next;
        tail = currentNode ;
        tail.next  = null ;
        size--;
        return  tail.value;
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
