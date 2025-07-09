package LinkList;

import RecursionPattern.BinarySubStrings;

public class LL {

    private    Node head ;
    private    Node tail ;
    protected   int size  ;

    public  Node getHead(){
        return head;
    }
    public  LL(){
        this.size = 0 ;
    }
    public  LL (Node node){
        this.head = node;
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
    public  Node find(int value){
        Node  currentNode = head ;
        while (currentNode != null){
            if (currentNode.value ==  value){
                return  currentNode ;
            }
            currentNode=  currentNode.next;
        }
        return  null;
    }
    public  void  insertRecu(int idx , int val){
        head = insertRecu(idx , val , head );
    }

    private Node insertRecu(int idx , int val , Node node ){
        if(idx ==0 ){
            Node temp = new Node(val ,node);
            size++;
            return  temp;
        }
        node.next= insertRecu(idx-1 ,  val , node.next);
        return node;
    }

    protected class  Node{

        protected   int value ;
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
