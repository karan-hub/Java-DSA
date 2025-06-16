package LinkList;

public class DLL {
    Node head ;

    public  void  insertFrist(int value){
        Node node = new Node(value);
        node.next= head;
        node.previos = null;
        if (head != null){
            head.previos = node ;
        }
        head = node;
    }
    public  void  insertlast(int value){
        Node node = new Node(value);
        Node tail  = head;
        node.next=null;
        if (head == null){
            node.previos =null;
            head =node;
            return;
        }

        while (tail.next != null){
            tail = tail.next ;
        }
        tail.next= node;
        node.previos=tail;
        node.next=null;


    }
    public  void  displayList(){
        Node node  = head;

        while (node != null){
            System.out.print("[" + node.value + "] <---> ");
            node = node.next ;
        }
        System.out.println("[NULL]");
    }
    public  void  displayReverseList(){
        Node node  = head;
        Node last = null;

        while (node != null){
            last =node;
            node = node.next ;
        }

        while (last != null){
            System.out.print("[" + last.value + "] <---> ");
            last= last.previos;
        }
        System.out.println("[NULL]");
    }

    public  void insertAfter(int after ,  int val){
        Node  node = new Node(val);
        Node targetNode = null;
        Node prev = head;
        while (prev != null) {
            if (prev.value == after){
                targetNode = prev;
                break;
            }
            prev = prev.next;

        }
        if (targetNode == null){
            System.out.println(after +"! not found");
            return;
        }
        node.previos = targetNode;
        node.next=targetNode.next;
        if (node.next != null){
            targetNode.next.previos= node;
        }
        targetNode.next = node;

    }

    private  class  Node {
        private int  value ;
        Node next;
        Node previos;

        private Node(){
            this.value=0;
        }
        private Node(int value){
            this.value=value;
        }
        private Node(int value , Node next ,Node previos ){
            this.value=0;
            this.next=next;
            this.previos=previos;
        }
    }

}
