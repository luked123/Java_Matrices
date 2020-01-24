import java.util.Scanner;

public class SumElementsInColumn {
    public static void main(String[] args){
        double[][] matrix = Matrices.createDoubleMatrixFromInput();
        int columns = matrix[0].length;

        for(int c = 0; c < columns; c++){
            System.out.printf("The sum of the elements at column %d is %.2f\n", c, Matrices.sumColumn(matrix, c));
        }
    }
}
