
/** Demos adding two matrices method */
public class AddingTwoMatrices {
    public static void main(String[] args){
        System.out.println("Enter matrix 1");
        double[][] m1 = Matrices.createDoubleMatrixFromInput();
        System.out.println();
        System.out.println("Enter matrix 2");
        double[][] m2 = Matrices.createDoubleMatrixFromInput();

        double[][] sumM1M2 = Matrices.addMatrix(m1, m2);

        // Display the sum
        System.out.println("The matrices are added as follows");
        for(int r = 0; r < m1.length; r++){
            for(int c = 0; c < m1[r].length; c++){
                System.out.printf("%.1f ",m1[r][c]);
            }

            if(r == 1){
                System.out.print("  +  ");
            }
            else{
                System.out.print("     ");
            }

            for(int c = 0; c < m1[r].length; c++){
                System.out.printf("%.1f ", m2[r][c]);
            }

            if(r == 1){
                System.out.print("  =  ");
            }
            else{
                System.out.print("     ");
            }

            if(sumM1M2 != null){
                for(int c = 0; c < m1[r].length; c++){
                    System.out.printf("%.1f ", sumM1M2[r][c]);
                }
            }

            System.out.println();
        }
    }
}
