import java.util.*;

public class N_Queens {
    public static boolean isSafe(char[][] board, int row, int col){
        //vertical]
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == '1'){
                return false;
            }
        }

        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == '1'){
                return false;
            }
        }

        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == '1'){
                return false;
            }
        }
        return true;

    }
    public static void nQueens(char[][] board, int row){
        if(row == board.length){
            printBoard(board);
            return;
        }
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = '1';
                nQueens(board, row+1); //function call
                board[row][j] = '0'; //backtracking step
            }
        }
    }

    public static void printBoard(char[][] board){

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println( );
    }

    public static void main(String[] args){
        int n = 4;
        char[][] board = new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '0';
            }
        }

        nQueens(board, 0);
    }
}
