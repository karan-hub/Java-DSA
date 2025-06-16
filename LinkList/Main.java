package LinkList;

public class Main {
    public static void main(String[] args) {
        LL link=  new LL();
        link.inserFrist(90);
        link.inserFrist(100);
        link.inserFrist(110);
        link.inserFrist(120);
        link.inserFrist(130);
        link.inserFrist(140);
        link.insertLast(99);
        link.display();
        System.out.println();
        link.insertAt(10000 , 3000);
        link.display();


    }
}
