package Basics;
import java.util.*;

public class Whileloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        int table = sc.nextInt();
        int i =10 ;
        while( i >= 1){
            System.out.print(table * i + " ") ;
            i--;
        }
    }
}
