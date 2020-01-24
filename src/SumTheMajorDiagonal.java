public class SumTheMajorDiagonal {
    public static void main(String[] args){
        double[][] matrix = Matrices.createDoubleMatrixFromInput();
        System.out.printf("Sum of the elements in the major diagonal is %.2f", Matrices.sumMajorDiagonal(matrix));
    }
}
