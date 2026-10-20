
/**
 * Main class to run program.
 * 
 * @version 22/06/2026
 * @author TuanPHAHE194741
 */
public class Main {
    public static void main(String[] args) {
        CaculatorMatrix caculator = new CaculatorMatrix();
        while (true) {            
            displayMenu();
            int choice = Unitity.checkUserInputSwitchCase("Your choice: ");
            switch (choice){
                
                // Case to use addition 2 matrix.
                case 1:
                    System.out.println("------- Addition -------");
                    int[][] matrix1a = enterMatrix(1);
                    int[][] matrix2a = enterMatrix(2);
                    caculator.additionMatrix(matrix1a, matrix2a);
                    break;
                    
                // Case to use subtraction 2 matrix.
                case 2:
                    System.out.println("------- Subtraction -------");
                    int[][] matrix1b = enterMatrix(1);
                    int[][] matrix2b = enterMatrix(2);
                    caculator.subtractionMatrix(matrix1b, matrix2b);
                    break;
                
                // Case to use multiplication 2 matrix.
                case 3:
                    System.out.println("------- Multiplication -------");
                    int[][] matrix1c = enterMatrix(1);
                    int[][] matrix2c = enterMatrix(2);
                    caculator.multiplicationMatrix(matrix1c, matrix2c);
                    break;
                case 4:
                    System.out.println("Exit program...");
                    return;
            }
        }
        
    }
    
    /**
     * Method display menu choice.
     */
    public static void displayMenu(){
        System.out.println("=======Caculator Program=======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Exit");
    }
    
    /**
     * Method use enter matrix.
     * @return matrix form user.
     */
    public static int[][] enterMatrix(int matrixNumber){
        int row = Unitity.checkUserInputMatrix("Enter Row Matrix"+ matrixNumber + ":" );
        int col = Unitity.checkUserInputMatrix("Enter Column Matrix"+ matrixNumber + ":" );
        int[][] matrix = new int[row][col];
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                matrix[i][j] = Unitity.checkUserInputElementMatrix("Enter Matrix" + matrixNumber + "[" + (i + 1) + "][" + (j + 1) + "]:");
            }
        }
        return matrix;
    }
}
