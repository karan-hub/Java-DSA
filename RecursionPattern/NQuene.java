package RecursionPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java8.BinaryOperator.Solution;

public class NQuene {
    public static void main(String[] args) {
        // List<List<String>> solutions = solveNQueens2(4);
       

        int count = 1;
        // for (List<String> board : solutions) {
        //     System.out.println("Solution " + count++ + ":");
        //     for (String row : board) {
        //         System.out.println(" " + row + " ");
        //     }
        //     System.out.println();
        // }
         String[][] solutionsNew = solveNQueens3(4);
         for (String[] strings : solutionsNew) {
            System.out.println(Arrays.toString(strings));
         }

    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] ch : board)
            Arrays.fill(ch, '_');
        solve(0, board, solutions);
         
        return solutions;
    }

     public static String[][] solveNQueens3(int n) {
        String[][] board2 = new String[n][n];
        Solution(0,board2);
        return board2;
    }

    public static void solve(int row, char[][] Board, List<List<String>> solutions) {
        if (row == Board.length) {
            List<String> current = new ArrayList<>();
            for (char[] ch : Board)
                current.add(new String(ch));
            solutions.add(current);
            return;
        }

        for (int col = 0; col < Board.length; col++) {
            if (isSafe(Board, row, col)) {
                Board[row][col] = 'Q';
                solve(row + 1, Board, solutions);
                Board[row][col] = '_';
            }
        }

    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // Check vertically up
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static List<List<String>> solveNQueens2(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        int[] column = new int[n];
        int[] LeftDaig = new int[2 * n - 1];
        int[] RightDaig = new int[2 * n - 1];

        for (char[] ch : board)
            Arrays.fill(ch, '_');
        find(0, n, board, solutions, column, RightDaig, LeftDaig);
        return solutions;
    }

    private static void find(int row, int n, char[][] board, List<List<String>> solutions, int[] column,
            int[] rightDaig, int[] leftDaig) {

        if (row == n) {
            List<String> current = new ArrayList<>();
            for (char[] ch : board)
                current.add(new String(ch));
            solutions.add(current);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (column[col] == 0 && leftDaig[n - 1 + col - row] == 0 && rightDaig[col + row] == 0) {
                column[col] = 1;
                board[row][col] = 'Q';
                leftDaig[n - 1 + col - row] = 1;
                rightDaig[col + row] = 1;
                find(row + 1, n, board, solutions, column, rightDaig, leftDaig);

                column[col] = 0;
                board[row][col] = '_';
                leftDaig[n - 1 + col - row] = 0;
                rightDaig[col + row] = 0;

            }
        }
    }

    public static boolean Solution(int row, String[][] board) {
      if(row>=board.length) 
      return true;

          for(int col=0 ;col <board.length; col++) {
            if (isSafe2(board, row, col)) {
                board[row][col]="Q";

                if ( Solution(row+1, board))
                    return true;
                

                 board[row][col]="_";
            }
          }

         return false;
    }

    private static boolean isSafe2(String[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[2][2] == "Q")
                return false;
        } 

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == "Q")
                return false;
        }

        for (int i = row - 1, j = col + 1; i < board.length && j < board.length; i++, j++) {
            if (board[i][j] == "Q")
                return false;
        }

        return true;
    }
}
