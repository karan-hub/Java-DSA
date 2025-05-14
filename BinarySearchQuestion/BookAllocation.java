package BinarySearchQuestion;
//same for painters partition
public class BookAllocation {
    public static void main(String[] args) {
        int result = allocate(new int[]{15,17,20} ,2);
        System.out.println(result);

    }
    public  static int   allocate(int [] arr , int student ){
        if ( student  > arr.length ) return  -1;
        int sum =0 ;
        for (int num : arr) sum +=num;
        int start = 0 , end =sum , ans=-1;

        while ( start <= end){
            int mid = (start+end)/2;
            if (isValidaAllocation(arr, mid, student)) {
                 ans  =  mid ;
                 end = mid-1 ;
            }else start = mid+1;
        }
        return  ans ;
    }

    private static boolean isValidaAllocation(int[] books, int maxAllowedPages, int numStudent) {
        int student =1 , allocatedPages = 0 ;
        for (int pages : books){
            if (pages > maxAllowedPages) return  false;
            if (allocatedPages + pages <= maxAllowedPages){
                allocatedPages+=pages;
            }else {
                student++;
                allocatedPages=pages;
            }
        }
        return student <= numStudent;
    }
}

