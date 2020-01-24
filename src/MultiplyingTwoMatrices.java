public class MultiplyingTwoMatrices {
    public static void main(String[] args){
        System.out.println("Enter matrix 1");
        double[][] m1 = Matrices.createDoubleMatrixFromInput();
        System.out.println();
        System.out.println("Enter matrix 2");
        double[][] m2 = Matrices.createDoubleMatrixFromInput();

        double[][] productM1M2 = Matrices.multiplyMatrix(m1, m2);

        // Display the sum
        System.out.println("The multiplication of the matrices is");
        for(int r = 0; r < m1.length; r++){
            for(int c = 0; c < m1[r].length; c++){
                System.out.printf("%.1f ",m1[r][c]);
            }

            if(r == 1){
                System.out.print("  *  ");
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

            if(productM1M2 != null){
                for(int c = 0; c < m1[r].length; c++){
                    System.out.printf("%.1f ", productM1M2[r][c]);
                }
            }

            System.out.println();
        }
    }
}
