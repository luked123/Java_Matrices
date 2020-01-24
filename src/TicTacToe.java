import java.util.Scanner;

/** Simulates a Tic Tac Toe game
 * Code still needs to be refined, will update when I learn to use objects
 */
public class TicTacToe {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] board = new int[3][3];
        boolean gameOver = false;

        // Player X starts first
        boolean playerX = true;

        // True until win or cats game
        while(!gameOver){
            displayBoard(board);
            playerTurn(playerX, board, input);

            // If player wins
            if(gameOver = checkGame(board)){
                displayBoard(board);
                playerWins(playerX);
            }
            // If players tie
            else if(gameOver = checkCatsGame(board)){
                System.out.println("Cats Game no one wins :(");
            }
            // Change turns
            playerX = !playerX;
        }
    }

    /** Displays the current board */
    public static void displayBoard(int[][] board){
        System.out.println();
        System.out.println("     0       1      2 ");
        System.out.println("  ----------------------");
        for(int r = 0; r < board.length; r++){
            System.out.printf("%d |  ", r);
            for(int c = 0; c < board[r].length; c++){
                if(board[r][c] == 0){
                    System.out.printf(" %s  |  ", " ");
                }
                else if(board[r][c] == 1){
                    System.out.printf(" %s  |  ", "X");
                }
                else{
                    System.out.printf(" %s  |  ", "O");
                }
            }
            System.out.println();
            System.out.println("  ----------------------");
        }
        System.out.println();
    }

    /** Simulates the players turn in the game */
    public static void playerTurn(boolean playerX, int[][] board, Scanner input){
        boolean valid = false;

        while(!valid) {
            // Player 1
            if (playerX) {
                System.out.print("Enter a row (0, 1, or 2) for player X: ");
                int row = input.nextInt();
                System.out.print("Enter a Column (0, 1, or 2) for player X: ");
                int column = input.nextInt();

                // Checks to see if space is empty
                if (board[row][column] == 0) {
                    board[row][column] = 1;
                    valid = true;
                } else {
                    System.out.println("Space is already filled, pick another spot");
                }
            }
            // Player 2
            else {
                System.out.print("Enter a row (0, 1, or 2) for player O: ");
                int row = input.nextInt();
                System.out.print("Enter a Column (0, 1, or 2) for player O: ");
                int column = input.nextInt();

                // Checks to see if space is empty
                if (board[row][column] == 0) {
                    board[row][column] = 2;
                    valid = true;
                } else {
                    System.out.println("Space is already filled, pick another spot");
                }
            }
        }
    }

    /** Checks the game to see if a player has won or not */
    public static boolean checkGame(int[][] board){
        boolean win = false;

        for(int r = 0; r < board.length; r++){
            if(win = checkRow(board, r)){
                return win;
            }
        }
        for(int c = 0; c < board[0].length; c++){
            if(win = checkColumn(board, c)){
                return win;
            }
        }

        if(win = checkDiagonal1(board)){
            return win;
        }

        if(win = checkDiagonal2(board)){
            return win;
        }

        return win;
    }

    /** Displays who won */
    public static void playerWins(boolean playerX){
        if(playerX){
            System.out.println("Player X wins!!");
        }
        else{
            System.out.println("Player O wins!!");
        }
    }

    /** Checks row index for a win */
    public static boolean checkRow(int[][] board, int row){
        int inARow = 0;

        for(int c = 0; c < board[row].length; c++){
            if(board[row][c] == 1){
                inARow++;
            }
            else if(board[row][c] == 2){
                inARow--;
            }
        }

        return inARow == 3 || inARow == -3;
    }

    /** Checks column index for a win */
    public static boolean checkColumn(int[][] board, int column){
        int inARow = 0;

        for(int r = 0; r < board.length; r++){
            if(board[r][column] == 1){
                inARow++;
            }
            else if(board[r][column] == 2){
                inARow--;
            }
        }

        return inARow == 3 || inARow == -3;
    }

    /** Checks one of the main diagonals for a win */
    public static boolean checkDiagonal1(int[][] board){
        int inARow = 0;
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board.length; c++){
                if(r == c){
                    if(board[r][c] == 1){
                        inARow++;
                    }
                    else if(board[r][c] == 2){
                        inARow--;
                    }
                }
            }
        }

        return inARow == 3 || inARow == -3;
    }

    /** Checks one of the other main diagonal */
    public static boolean checkDiagonal2(int[][] board){
        int inARow = 0;
        int column = board.length - 1;

        for(int r = 0; r < board.length; r++){
            if(board[r][column] == 1){
                inARow++;
            }
            else if(board[r][column] == 2){
                inARow--;
            }
            column --;
        }

        return inARow == 3 || inARow == -3;
    }

    /** Checks to see if the game resulted in a cats game (tie) */
    public static boolean checkCatsGame(int[][] board){
        int count = 0;
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board.length; c++){
                if(board[r][c] != 0){
                    count++;
                }
            }
        }

        return count == 9;
    }
}
