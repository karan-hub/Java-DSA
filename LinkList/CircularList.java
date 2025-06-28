package LinkList;

public class CircularList {
    private  Node head ;
    private  int size;
    private  Node tail ;

    public  CircularList(){
        this.head =null;
        this.tail = null;
        this.size=0;
    }

    public  void insertFrist(int value){
        Node node = new Node(value);
        if (head== null){
            head= node;
            tail=node;
            return;
        }
        node.next= head;
        tail.next=node;
        head=node;

    }
    public  void insertLast(int value){
        Node node = new Node(value);
        if (head== null){
            head= node;
            tail=node;
            return;
        }
        tail.next= node;
        tail=node;
        tail.next=head;
    }
    public  void  display(){
        Node node=head;

        if (head!= null){
            do {
                System.out.print("["+node.value+"] -->");
                node= node.next;
            }while (node != head);
        }
    }
    public  void deletValue(int value){
        if (head==null) return;
        Node node =head;

        if (node.value==value){
            head = head.next;
            tail.next=head;
            return;
        }
        Node temp = null;
        do {
            if (node.next.value == value){
                temp= node.next;
                break;
            }
            node = node.next;
        }while ( node!= head);
        if (temp== null) {
            System.out.println("value not found");
            return;
        }

        node.next=temp.next;



    }

    private   class   Node {
        int value ;
        Node next ;
        public  Node(int value){
            this.value= value ;
        }
        public  Node(){
            this.value=0;
        }
    }
}
