import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] board = new int[3][3];
        boolean gameOver = false;
        boolean playerX = true;

        while(!gameOver){
            displayBoard(board);
            playerTurn(playerX, board, input);
            if(gameOver = checkGame(board)){
                displayBoard(board);
                playerWins(playerX);
            }else if(gameOver = checkCatsGame(board)){
                System.out.println("Cats Game no one wins :(");
            }
            playerX = !playerX;
        }
    }

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

    public static void playerTurn(boolean playerX, int[][] board, Scanner input){
        boolean valid = false;

        while(!valid) {
            if (playerX) {
                System.out.print("Enter a row (0, 1, or 2) for player X: ");
                int row = input.nextInt();
                System.out.print("Enter a Column (0, 1, or 2) for player X: ");
                int column = input.nextInt();
                if (board[row][column] == 0) {
                    board[row][column] = 1;
                    valid = true;
                } else {
                    System.out.println("Space is already filled, pick another spot");
                }
            } else {
                System.out.print("Enter a row (0, 1, or 2) for player O: ");
                int row = input.nextInt();
                System.out.print("Enter a Column (0, 1, or 2) for player O: ");
                int column = input.nextInt();
                if (board[row][column] == 0) {
                    board[row][column] = 2;
                    valid = true;
                } else {
                    System.out.println("Space is already filled, pick another spot");
                }
            }
        }
    }

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

        if(win = checkDiagnol1(board)){
            return win;
        }

        if(win = checkDiagnol2(board)){
            return win;
        }

        return win;
    }

    public static void playerWins(boolean playerX){
        if(playerX){
            System.out.println("Player X wins!!");
        }
        else{
            System.out.println("Player O wins!!");
        }
    }

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

    public static boolean checkDiagnol1(int[][] board){
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

    public static boolean checkDiagnol2(int[][] board){
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
