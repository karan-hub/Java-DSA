package StringsBasicMedium;

public class isRotatedVersion {
    public static void main(String[] args) {
//        System.out.println(manualRatationCheck("hello", "hellm"));

        System.out.println(subStringCheck("hello" , "llohe"));
    }

     static  boolean  manualRatationCheck(String original , String rorated ){
        if (original.length() !=  rorated.length()) return   false ;

        boolean isRoated= false ;
        int len =  rorated.length();
         for (int i = 0; i < len; i++) {

             StringBuilder check = new StringBuilder();

             for (int j = i; j < len; j++) {
                 check.append(rorated.charAt(j));
             }

             for (int j = 0; j < i; j++) {
                 check.append(rorated.charAt(j));
             }
             if (original.contentEquals(check)) {
                  isRoated = true;
                  break;
             }

         }
         return  isRoated;
    }

   static boolean subStringCheck(String original , String rotated){
        if (original.length() != rotated.length()) return  false ;

        boolean isRoatated = false ;

        for (int i = 0; i < rotated.length(); i++) {
            String check = rotated.substring(i) + rotated.substring(0 ,i);

            if (original.equals(check)) {
                isRoatated = true;
                break;
            }
            }
        return  isRoatated;
    }



    }