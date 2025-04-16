package RecursionBasic;

public class AtoiString {
    public static void main(String[] args) {

        System.out.println(myAoi("   -042"));

    }

    static  int myAoi(String s){

        if (s==null || s.isEmpty() ) return 0;
        int sing =1 , i =0 ;
        long result =0 ;

         return Atoi(s , sing , i , result);
    }

    static  int Atoi(String s , int sing , int i , long result  ){
        if (i == s.length()) return  (int) (sing * result);

        if ( i < s.length() && s.charAt(i) ==' ') return  Atoi( s , sing ,++i ,result);

        if (i >= s.length() ) return  0;
        if ( i < s.length() && (s.charAt(i) =='-' || s.charAt(i)=='+')){
            sing =  (s.charAt(i)=='-') ? -1:1;
             return Atoi(s , sing , ++i , result );
        }

        if ( i<s.length() && Character.isDigit(s.charAt(i))){
            result = result*10 +(s.charAt(i)-'0');

            if ( sing ==1 && result > Integer.MAX_VALUE) return  Integer.MAX_VALUE;
            if ( sing ==-1 && -result < Integer.MIN_VALUE) return  Integer.MIN_VALUE;
            return Atoi(s , sing , ++i , result );
        }
return 0;
    }
}
