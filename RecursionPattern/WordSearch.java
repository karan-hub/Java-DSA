package RecursionPattern;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "ABCB";

        System.out.println(exist(board , word));

    }
   public static   int m , n ;
    public static boolean exist(char[][] board, String word) {
        m= board.length;;
        n= board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                    if (board[i][j] == word.charAt(0) && find( board, i , j , 0 , word)){
                        return  true ;
                    }

            }
        }
        return   false ;
    }

    public  static   int [][]  direction = {{1,0} ,{-1,0} ,{0,1} ,{0,-1}} ;
    public static boolean find(char[][] board , int i , int  j , int idx, String word){
        if (idx ==  word.length()) return  true ;

        if (i < 0 || j < 0 || i >= m || j >=n || board[i][j] == '$' || board[i][j] != word.charAt(idx))
            return   false ;

        char temp =  board[i][j]  ;
        board[i][j] = '$' ;

       for (int [] D : direction){
           int new_i = i + D[0] ;
           int new_j = j + D[1] ;

           if (find( board, new_i ,  new_j, idx+1 , word))
               return   true ;
       }
        board[i][j] = temp ;
        return   false ;
    }
}
