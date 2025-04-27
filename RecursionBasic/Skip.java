package RecursionBasic;

public class Skip {
    public static void main(String[] args) {
        skipChar("ababababa" , "");
    }

    public static void   skipChar(String str , String result){

        if (str.isEmpty()){
            System.out.println(result);
            return;
        }
        char ch = str.charAt(0);

        if (ch=='a') skipChar(str.substring(1), result);
        else skipChar(str.substring(1), result+ch);

    }

}
