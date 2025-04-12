package StringsBasicMedium;

import java.sql.Struct;

public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("   -42"));           // -42
        System.out.println(myAtoi("4193 with words"));  // 4193
        System.out.println(myAtoi("words and 987"));    // 0
        System.out.println(myAtoi("-91283472332"));     // -2147483648
    }

    static  int myAtoi(String str ){
        if (!(str != null || str.isEmpty())) return  0;
        int i =0  , sign =1 , n = str.length();
        long result =0 ;

//        skip Leading spaces
        while ( i < n && str.charAt(i)==' ') i++;

//      check for sign
        if (str.charAt(i) =='-' || str.charAt(i) == '+') {
            sign = (str.charAt(i) == '-') ? -1:1;
            i++;
        }
//       check for producing digit and Overflow

        while (i<n && Character.isDigit(str.charAt(i))){
            result = result * 10 + (str.charAt(i) - '0');
            if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return  (int) result * sign;

    }
}
