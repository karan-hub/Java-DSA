package LinkList;

public class Main {
    public static void main(String[] args) {
        LL link=  new LL();
        link.inserFrist(10);
        link.inserFrist(20);
        link.inserFrist(30);
        link.inserFrist(40);
        System.out.println("\n\n ============= Link List ============= ");
        link.display();
        link.insertLast(50);
        System.out.println("\n\n============= insert Last =============");
        link.display();
        System.out.println("\n\n============= insert At =============");
        link.insertAt(60 , 3);
        link.display();
        System.out.println("\n\n============= Delet Frist =============");
        link.deletFrist();
        link.display();
        System.out.println("\n\n============= Delet At =============");
        link.deletAt(3);
        link.display();
        System.out.println("\n\n============= Delet last =============");
        link.deletLast();
        link.display();



    }
}
