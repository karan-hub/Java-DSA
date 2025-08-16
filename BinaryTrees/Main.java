package BinaryTrees;

import java.util.*;

public class Main {

    public  static  void BT(){
        System.out.println("Binary Tree");
        Scanner scanner = new Scanner(System.in);
        List<BinaryTree> bts=  new ArrayList<>();
        while (true){
            System.out.println("Press [ 1 ] For New Tree");
            System.out.println("Press [ 2 ] For Display Tree");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 : {
                    BinaryTree bt = new BinaryTree();
                    bt.populate(scanner);
                    bts.add(bt);
                }
                break;
                case 2 :  {
                    System.out.println("which tree u want to display");
                    bts.forEach(x->System.out.println(x.getRoot()));
                    int selectedTree = scanner.nextInt();
                    Optional<BinaryTree> founded=bts.stream().filter(x->x.getRoot() ==selectedTree).findFirst();
                    founded.ifPresent(binaryTree -> binaryTree.display(scanner));
                }
                break;
                default :{
                    System.out.println("Invalid Entry For " + choice);
                    return;
                }
            }
        }





    }

    public static void main(String[] args) {
       BT();

    }
}
