// print the all possibe positions for the N queens where every queen will be in a safe position
import java.util.*;
public class recNqueens {
    // Creating a function to save the solution on the board
    public void saveBoard(char[][] board, List<List<String>> allBoards){
        // String row= "";
        List<String> newBoard= new ArrayList<>();
        for(int i= 0; i< board.length; i++){
            String row = new String(board[i]);
            newBoard.add(row);
        }
        allBoards.add(newBoard);
        //     row= "";
        //     for(int j= 0; j< board[0].length; j++){
        //         if(board[i][j]== 'Q')
        //         row += 'Q';
        //         if (board[i][j]== '.')
        //         row+= '.';
        //     }
        //     newBoard.add(row);
        // }
        // allBoards.add(newBoard);
    }
    // Creating a function that will check the safety of the queens
    public boolean isSafe(int row, int col, char[][] board){
        // horizontally
        for(int j= 0; j< board.length; j++){
            if(board[row][j]== 'Q')
            return false;
        }
        //vertically
        for(int i= 0;i< board.length; i++){
            if(board[i][col]== 'Q')
            return false;
        }
        // upperleft
        int r= row;
        for(int c= col; c>=0 && r>= 0; c--,r--){
            if(board[r][c]== 'Q')
            return false;
        }
        // upper right
        r= row;
        for(int c= col;c< board.length && r>= 0; c++,r--){
            if(board[r][c]== 'Q')
            return false;
        }
        // lower left
        r= row;
        for(int c= col; c>= 0 && r < board.length; c--, r++){
            if(board[r][c]== 'Q')
            return false;
        }
        // lower right
        r= row;
        for(int c= col; c< board.length && r< board.length; c++, r++){
            if(board[r][c]== 'Q')
            return false;
        }
        return true;

    }
    // creating a helper function that will perform the recursion and backtracking
    public void helper(char[][] board, List<List<String>> allBoards, int col){
        if(col== board.length){
            saveBoard(board, allBoards);
            return;
        }
        for(int row= 0; row< board.length; row++){        //selecting the row and then placing the queen in that specific row traversing through the columns of that specific row
            if(isSafe(row, col, board)){
                board[row][col]= 'Q';
                helper(board, allBoards, col+ 1);
                board[row][col]= '.'; // if we want to remove the queen from that position
            }

        }

    }
    // Creating the function to solve the nqueens
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards= new ArrayList<>();
        char[][] board= new char[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.'); // Initialize the board with '.'
        }
        helper(board, allBoards, 0);
        return allBoards;
        

        


    }
    public static void main(String args[]){
        int size = 4;
        recNqueens solver = new recNqueens();
        List<List<String>> solutions = solver.solveNQueens(size);
        for (List<String> solution : solutions) {
        for (String row : solution) {
            System.out.println(row);
        }
        System.out.println();

        }
    }
}