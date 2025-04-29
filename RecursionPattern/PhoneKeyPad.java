package RecursionPattern;

import java.util.ArrayList;
import java.util.List;

public class PhoneKeyPad {
    public static void main(String[] args) {
//        pad("" , "23");
        List<String> list=   letterCombinationsList("" ,"23");
        System.out.println(list);

        int count = letterCombinationsCount("" ,"");
        System.out.println(count);

    }

    public  static void pad(  String Process,String unProcess) {

        if (unProcess.isEmpty()) {
            System.out.print(Process+ "  ");
            return;
        }

        char digit = (char) (unProcess.charAt(0) -'0');
        for (int i = (digit -1) *3; i < digit *3 ; i++) {
            char  ch  = (char) ('a'+ i);
            pad(Process+ch, unProcess.substring(1));
        }
    }


    public static List<String> letterCombinationsList(String process, String unprocess) {
        List<String>  l = new ArrayList<>();
        if (unprocess.isEmpty() && process.isEmpty() ) return  l ;
        if (unprocess.isEmpty()){
                l.add(process);
                return l;
            }

        int  digit = (char) (unprocess.charAt(0) -'0')-1;
        List<String>  list = new ArrayList<>();
        for (int i = (digit -1) *3; i < digit *3 ; i++) {
            char  ch  = (char) ('a'+ i);
            list.addAll(letterCombinationsList(process+ch, unprocess.substring(1)));
        }


        return list;
    }

    public static  int  letterCombinationsCount(String process, String unprocess) {
        if (unprocess.isEmpty()) return 1;


        char digit = (char) (unprocess.charAt(0) -'0');


        int count =0 ;
        for (int i = (digit -1) *3; i < digit *3 ; i++) {
            char  ch  = (char) ('a'+ i);
            count = count + letterCombinationsCount(process+ch, unprocess.substring(1));
        }


        return count;
    }


    public List<String> PhonePad(String process, String unprocess) {
        // Keypad map
        String[] keypad = {
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9
        };

        List<String> result = new ArrayList<>();

        if (unprocess.isEmpty()) {
            if (!process.isEmpty()) {
                result.add(process);
            }
            return result;
        }

        char ch = unprocess.charAt(0);
        int digit = ch - '0';
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            result.addAll(letterCombinationsList(process + letter, unprocess.substring(1)));
        }

        return result;
    }



}
