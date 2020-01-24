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

    /** Adds two matrices together and returns the resulting matrix */
    public static double[][] addMatrix(double[][] m1, double[][] m2){

        // Checks to see if matrices have same dimensions
        if(m1.length != m2.length){
            System.out.println("Matrices must have the same dimensions. Returning null");
            return null;
        }
        for(int r = 0; r < m1.length; r ++){
            if(m1[r].length != m2[r].length){
                System.out.println("Matrices must have the same dimensions. Returning null");
                return null;
            }
        }

        // Create the new matrix
        double[][] sumMatrix = new double[m1.length][m1[0].length];

        // Compute the sum of two matrices
        for(int r = 0; r < m1.length; r++){
            for(int c = 0; c < m1[r].length; c++){
                sumMatrix[r][c] = m1[r][c] + m2[r][c];
            }
        }

        return sumMatrix;
    }

    /** Adds two matrices together and returns the resulting matrix */
    public static int[][] addMatrix(int[][] m1, int[][] m2){

        // Checks to see if matrices have same dimensions
        if(m1.length != m2.length){
            System.out.println("Matrices must have the same dimensions. Returning null");
            return null;
        }
        for(int r = 0; r < m1.length; r ++){
            if(m1[r].length != m2[r].length){
                System.out.println("Matrices must have the same dimensions. Returning null");
                return null;
            }
        }

        // Create the new matrix
        int[][] sumMatrix = new int[m1.length][m1[0].length];

        // Compute the sum of two matrices
        for(int r = 0; r < m1.length; r++){
            for(int c = 0; c < m1[r].length; c++){
                sumMatrix[r][c] = m1[r][c] + m2[r][c];
            }
        }

        return sumMatrix;
    }

    /** Multiples two matrices together and returns the resulting matrix */
    public static double[][] multiplyMatrix(double[][] m1, double[][] m2){
        // Checks to see if the number of columns in m1 is equal to the number of rows in m2
        // Returns null if invalid
        for(int r = 0; r < m1.length; r++){
            for(int c = 0; c < m1[r].length; c++){
                if(m1[r].length != m2.length){
                    System.out.println("Number of columns in matrix 1 must match the number of rows in matrix 2. Returning null");
                    return null;
                }
            }
        }

        double[][] productMatrix = new double[m1.length][m2[0].length];

        for(int r = 0; r < productMatrix.length; r++){
            for(int c = 0; c < productMatrix[r].length; c++){
                for(int n = 0; n < m1[r].length; n++){
                    productMatrix[r][c] += m1[r][n] * m2[n][c];
                }
            }
        }

        return productMatrix;
    }

    /** Multiples two matrices together and returns the resulting matrix */
    public static int[][] multiplyMatrix(int[][] m1, int[][] m2){
        // Checks to see if the number of columns in m1 is equal to the number of rows in m2
        // Returns null if invalid
        for(int r = 0; r < m1.length; r++){
            for(int c = 0; c < m1[r].length; c++){
                if(m1[r].length != m2.length){
                    System.out.println("Number of columns in matrix 1 must match the number of rows in matrix 2. Returning null");
                    return null;
                }
            }
        }

        int[][] productMatrix = new int[m1.length][m2[0].length];

        for(int r = 0; r < productMatrix.length; r++){
            for(int c = 0; c < productMatrix[r].length; c++){
                for(int n = 0; n < m1[r].length; n++){
                    productMatrix[r][c] += m1[r][n] * m2[n][c];
                }
            }
        }

        return productMatrix;
    }
}
