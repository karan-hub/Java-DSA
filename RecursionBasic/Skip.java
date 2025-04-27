package RecursionBasic;

public class Skip {
    public static void main(String[] args) {
//        skipChar("ababababa" , "");
//        System.out.println(skipChar("karan"));
        System.out.println(skipAppNotApple("If it's an imposter 'App', slice it off. If it's the true king 'Apple', crown it and move on."));
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

    public static String   skipChar(String str ){
        if (str.isEmpty()) return "";
        if (str.startsWith("a")) return skipChar(str.substring(1));
        else return  str.charAt(0)+skipChar(str.substring(1));
    }

    public static String   skipAppNotApple(String str ){
        if (str.isEmpty())
            return "";

        if (str.startsWith("App") && !str.startsWith("Apple"))
            return skipAppNotApple(str.substring(3));
        else
            return  str.charAt(0)+skipAppNotApple(str.substring(1));
    }


}
