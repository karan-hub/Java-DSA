package RecursionPattern;

public class BinarySubStrings {
    public static void main(String[] args) {
        getAllSubString(2 ,"");
    }

    static  void  getAllSubString(int length , String str){
        if (str.length() == length){
            System.out.println(str);
            return;
        }


        getAllSubString(length , str+"0");
        getAllSubString(length , str+"1");

    }
}
