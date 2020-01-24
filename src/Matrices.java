import java.util.Scanner;


/** Methods involving matrices */
public class Matrices {

    /** Prints a double matrix row by row */
    public static void printMatrix(double[][] matrix){
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[r].length; c++){
                System.out.printf("%.2f ", matrix[r][c]);
            }
            System.out.println();
        }
    }

    /** Prints an integer matrix row by row */
    public static void printMatrix(int[][] matrix){
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[r].length; c++){
                System.out.printf("%d ", matrix[r][c]);
            }
            System.out.println();
        }
    }

    /** Creates and returns a double matrix from user input */
    public static double[][] createDoubleMatrixFromInput(){
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for amount of rows
        System.out.print("Enter the amount of rows for the matrix: ");
        int rows = input.nextInt();
        // Prompt user for amount of columns
        System.out.print("Enter the amount of columns for the matrix: ");
        int columns = input.nextInt();
        System.out.println();

        // Create matrix
        double[][] matrix = new double[rows][columns];
        System.out.printf("Enter a %d-by-%d matrix row by row:\n", rows, columns);

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){
                matrix[r][c] = input.nextDouble();
            }
        }

        return matrix;
    }

    /** Creates and returns a integer matrix from user input */
    public static int[][] createIntegerMatrixFromInput(){
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for amount of rows
        System.out.print("Enter the amount of rows for the matrix: ");
        int rows = input.nextInt();
        // Prompt user for amount of columns
        System.out.print("Enter the amount of columns for the matrix: ");
        int columns = input.nextInt();
        System.out.println();

        // Create matrix
        int[][] matrix = new int[rows][columns];
        System.out.printf("Enter a %d-by-%d matrix row by row:\n", rows, columns);

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){
                matrix[r][c] = input.nextInt();
            }
        }

        return matrix;
    }

    /** Sums the column in matrix for specified column index */
    public static double sumColumn(double[][] matrix, int columnIndex){
        double sum = 0;

        for(int r = 0; r < matrix.length; r ++){
            sum += matrix[r][columnIndex];
        }

        return sum;
    }

    /** Sums the column in matrix for specified by column index */
    public static int sumColumn(int[][] matrix, int columnIndex){
        int sum = 0;

        for(int r = 0; r < matrix.length; r ++){
            sum += matrix[r][columnIndex];
        }

        return sum;
    }

    /** Sums the row in matrix specified by rowIndex */
    public static double sumRow(double[][] matrix, int rowIndex){
        double sum = 0;
        for(int c = 0; c < matrix[rowIndex].length; c++) {
            sum += matrix[rowIndex][c];
        }

        return sum;
    }

    /** Sums the row in matrix specified by rowIndex */
    public static int sumRow(int[][] matrix, int rowIndex){
        int sum = 0;
        for(int c = 0; c < matrix[rowIndex].length; c++) {
            sum += matrix[rowIndex][c];
        }

        return sum;
    }

    /** Sums the major Diagonal of an n X n Matrix */
    public static double sumMajorDiagonal(double[][] matrix){
        double sum = 0;

        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[r].length; c++){
                if(c == r){
                    sum += matrix[c][r];
                }
            }
        }

        return sum;
    }
}
