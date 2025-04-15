package StringsBasicMedium;

import java.util.ArrayList;
import java.util.Arrays;

public class KMPPatternSearch {
    public static void main(String[] args) {
        String text = "aabaacaadaabaaba";
        String pattern = "aaba";

        KMPSearch(text, pattern);


    }
    public static int[] computeLPSArray(String pattern){
         int [] lps  = new int[pattern.length()];
         int len =0;
         int i = 1;

         while (i<pattern.length()){
             if (pattern.charAt(i)== pattern.charAt(len)){
                 len++;
                 lps[i]= len;
                 i++;
             }else {
                 if (len != 0 ) len = lps[len -1];
                 else {
                     lps[i]=0;
                     i++;
                 }
             }
         }
         return  lps;
    }

    public static ArrayList<Integer> KMPSearch(String text, String pattern){
        int [] lps=  computeLPSArray(pattern);
        int i =0 ;  //  for text
        int j =0;// for pattern
        ArrayList<Integer> list = new ArrayList<>();

        while (i<text.length()){
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == pattern.length()){
//                System.out.println("Pattern found at index " + (i - j));
                list.add(j-1);
                j = lps[j-1];
             }else if ( i< text.length() && pattern.charAt(j) != text.charAt(i)){
                if (j!=0) j =lps[j-1];
                else i++;
            }
        }
    return list;
     }

}
