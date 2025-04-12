package RecursionBasic;

public class oneToN {
    public static void main(String[] args) {
        printNum(1, 5);
    }
    public  static  void printNum(int start , int end){
        if(start > end) return;
        printNum(start+1 ,end);
        System.out.print(start+" ");

    }
}
