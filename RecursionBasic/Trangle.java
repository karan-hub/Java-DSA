package RecursionBasic;

public class Trangle {
    public static void main(String[] args) {
        printTrangle2(4,0);
    }

    static  void   printTrangle(int row , int col){
        if (row ==0) return ;
        if (col < row){
            System.out.print(" * ");
            printTrangle(row , col+1);
        }else {
            System.out.println();
            printTrangle(row-1 , 0);
        }
    }


    static  void   printTrangle2(int row , int col){
        if (row ==0) return ;
        if (col < row){
            System.out.print(" " + (row +col) +" " );
            printTrangle2(row , col+1);
        }else {
            System.out.println();
            printTrangle2(row-1 , 0);
        }
    }
}
