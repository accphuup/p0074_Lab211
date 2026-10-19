/**
 * CaculatorMatrix to addition, subtraction, multiplication matrix.
 *
 * @version 22/06/2026
 * @author TuanPHAHE194741
 */
public class CaculatorMatrix {

    /**
     * Encapsulation: keep matrixResult use in CaculatorMatrix class.
     */
    private int[][] matrixResult;

    /**
     * Method addition 2 matrix.
     *
     * @param matrix1 from user enter.
     * @param matrix2 from user enter.
     * @return the result matrix (null if 2 matrix are not the same size).
     */
    public int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        // Check if 2 matrix have the same row and column then addition.
        if (row1 == row2 && col1 == col2) {
            matrixResult = new int[row1][col1];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            displayResult(matrix1, matrix2, "+");
        } // Row and column are different.
        else {
            System.err.println("Row and column of two matrix are different.");
            matrixResult = null;
        }
        return matrixResult;
    }

    /**
     * Method subtraction 2 matrix.
     *
     * @param matrix1 from user enter.
     * @param matrix2 from user enter.
     * @return the result matrix (null if 2 matrix are not the same size).
     */
    public int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        // Check if 2 matrix have the same row and column then subtraction.
        if (row1 == row2 && col1 == col2) {
            matrixResult = new int[row1][col1];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrixResult[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            displayResult(matrix1, matrix2, "-");
        } // Row and column are different.
        else {
            System.err.println("Row and column of two matrix are different.");
            matrixResult = null;
        }
        return matrixResult;
    }

    /**
     * Method multiplication 2 matrix.
     *
     * @param matrix1 from user enter.
     * @param matrix2 from user enter.
     * @return the result matrix (null if column of matrix 1 != row of matrix 2).
     */
    public int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        // Check if column of matrix 1 equals row of matrix 2 then multiplication.
        if (col1 == row2) {
            matrixResult = new int[row1][col2];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col1; k++) {
                        matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            displayResult(matrix1, matrix2, "*");
        } // Row and column are different.
        else {
            System.err.println("Column of matrix 1 must be equal to row of matrix 2.");
            matrixResult = null;
        }
        return matrixResult;
    }

    /**
     * Display result on screen.
     *
     * @param matrix1 from user enter.
     * @param matrix2 from user enter.
     */
    private void displayResult(int[][] matrix1, int[][] matrix2, String msg) {

        // Display matrix 1.
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print("[" + matrix1[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println(msg);

        //Display matrix 2.
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print("[" + matrix2[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("=");

        //Display matrix result.
        for (int i = 0; i < matrixResult.length; i++) {
            for (int j = 0; j < matrixResult[0].length; j++) {
                System.out.print("[" + matrixResult[i][j] + "]");
            }
            System.out.println();
        }
    }
}