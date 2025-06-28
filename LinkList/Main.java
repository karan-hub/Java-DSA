package LinkList;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        LL link=  new LL();
//        link.inserFrist(10);
//        link.inserFrist(20);
//        link.inserFrist(30);
//        link.inserFrist(40);
//        System.out.println("\n\n ============= Link List ============= ");
//        link.display();
//        link.insertLast(50);
//        System.out.println("\n\n============= insert Last =============");
//        link.display();
//        System.out.println("\n\n============= insert At =============");
//        link.insertAt(60 , 3);
//        link.display();
//        System.out.println("\n\n============= Delet Frist =============");
//        link.deletFrist();
//        link.display();
//        System.out.println("\n\n============= Delet At =============");
//        link.deletAt(3);
//        link.display();
//        System.out.println("\n\n============= Delet last =============");
//        link.deletLast();
//        link.display();
//        System.out.println("\n\n=============  Find  =============");
//        link.find(20);
//        link.display();


//        DLL Dlink = new DLL();
//        Dlink .insertFrist(10);
//        Dlink.insertFrist(20);
//        Dlink.insertFrist(30);
//        Dlink.insertFrist(40);
//        System.out.println("\n\n=============  Insert Last  =============");
//        Dlink.insertlast(100);
//        Dlink.displayList();
//        System.out.println("\n\n=============  Dispaly Forword  =============");
//        Dlink.displayList();
//        System.out.println("\n\n=============  Dispaly Backword  =============");
//        Dlink.displayReverseList();
//
//        System.out.println("\n\n=============   Insert After  =============");
//        Dlink.insertAfter(20,160);
//        Dlink.displayReverseList();

//        CircularList circle= new CircularList();
//        System.out.println("\n\n=============   Insert First  =============");
//        circle.insertFrist(20);
//        circle.insertFrist(21);
//        circle.insertFrist(22);
//        circle.insertFrist(23);
//        circle.display();
//        System.out.println("\n\n=============   Insert Last  =============");
//        circle.insertLast(31);
//        circle.insertLast(32);
//        circle.insertLast(33);
//        circle.insertLast(34);
//        circle.display();
//        System.out.println("\n\n=============   Insert Last  =============");
//        circle.deletValue(20);
//        circle.display();


//        System.out.println("\n\n=============   Insert  Using Recursion  =============");
//        LL ll = new LL();
//        ll.inserFrist(20);
//        ll.inserFrist(30);
//        ll.inserFrist(40);
//        ll.inserFrist(50);
//        ll.insertLast(60);
//        ll.insertRecu(2,100);
//        ll.display();


//
//        System.out.println("\n\n============= Remove Duplicates from Sorted List  =============");
//        RemoveDuplicate rf = new RemoveDuplicate();
//        rf.inserFrist(10);
//        rf.inserFrist(30);
//        rf.inserFrist(40);
//        rf.inserFrist(40);
//        rf.insertLast(60);
//        rf.removeDuplicate(rf.getHead());
//        rf.display();


        System.out.println("\n\n=============  Mearge Two sorted list   =============");
        System.out.println("\n\n=====   List 1   =====");
        LL list1=  new LL();
        list1.inserFrist(10);
        list1.inserFrist(20);
        list1.inserFrist(30);
        list1.inserFrist(40);
        list1.display();

        System.out.println("\n\n=====   List 2   =====");
        LL list2=  new LL();
        list2.inserFrist(10);
        list2.inserFrist(21);
        list2.inserFrist(23);
        list2.inserFrist(30);
        list2.inserFrist(42);
        list2.display();
        System.out.println("\n\n=====  Mearge   =====");
        Mearge mr = new Mearge() ;
        LL  ans  =  mr.meargeLists(list1 , list2);
        ans.display();




    }
}
