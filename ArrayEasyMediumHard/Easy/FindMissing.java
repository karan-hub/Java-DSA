package ArrayEasyMediumHard.Easy;

class FindMissing {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};

        
        int missingNumber = missing(arr);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int missing(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int flag = 0;


            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }

                
            }
            if (flag == 0)
                    return i;
        }

        return -1;
    }

}