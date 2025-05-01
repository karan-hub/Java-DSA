package RecursionPattern;

import java.util.Arrays;

public class SudokoSolver {
    public static void main(String[] args) {

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        solveSudoku(board);
        printBoard(board);



    }
    public static void solveSudoku(char[][] board) {
              helper(board , 0 , 0 ) ;

    }
    public static   boolean helper(char[][] board , int row  , int col ) {
        if (row == 9 )
            return  true ;

        int Nextrow = row , Nextcol = col+1 ;
        if (Nextcol == 9){
            Nextrow ++;
            Nextcol = 0 ;
        }
        if (board[row][col] != '.')
            return helper(board, Nextrow, Nextcol);


        for (char digit = '1'; digit <= '9' ; digit++) {
            if (isSafe(board , row , col , digit)) {
                board[row][col] = digit;
                if (helper(board, Nextrow, Nextcol))   return true ;
                board[row][col]= '.';
            }
        }
        return  false ;
    }

    public static  boolean isSafe(char[][] board , int row  , int col , char digit){
//        check row
        for (int i = 0; i < 9; i++)
            if (board[i][ col] == digit)
                return  false ;

//        check row
        for (int i = 0; i < 9; i++)
            if (board[row ][ i] == digit)
                return  false ;

//        3*3 gird
        int Startrow = (row/3)*3 ;
        int Startcol = (col/3)*3 ;

        for (int i = Startrow; i < Startrow+3 ; i++)
            for (int j = Startcol; j <  Startcol + 3; j++)
                if (board[i][j]== digit) return  false ;

        return  true ;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
