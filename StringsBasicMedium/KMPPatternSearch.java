package StringsBasicMedium;

import java.util.ArrayList;
import java.util.Arrays;

public class KMPPatternSearch {
    public static void main(String[] args) {
        String text = "aaaaab";
        String pattern = "aaab";
findString(text , pattern);
//        KMPSearch(text, pattern);
//        int [] arr= computeLPSArray(pattern);
//        System.out.println(Arrays.toString(arr));


    }
    public static int[] computeLPSArray(String pattern){
          int[] lps = new int[pattern.length()];
          int prefix =0;
          int suffix =1;

          while (suffix< pattern.length()){
              if (pattern.charAt(suffix) ==  pattern.charAt(prefix)){
                  lps[suffix]=prefix+1;
                  suffix++;
                  prefix++;
              }
              else {
                  if (prefix == 0) {
                      lps[suffix] =0;
                      suffix++;
                  }else {
                      prefix = lps[prefix-1];
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


     public  static void   findString(String str ,  String pat){
        int [] LPS = computeLPSArray(pat);
        int f = 0 ;
        int s = 0;
        while (f<str.length() &&  s< pat.length()){
            if (str.charAt(f) == pat.charAt(s)){
                f++;
                s++;
            }else {
                if (s ==0) f++;
                else {
                    s= LPS[s-1];
                }
            }
        }
         System.out.println(f-s);
     }

}
