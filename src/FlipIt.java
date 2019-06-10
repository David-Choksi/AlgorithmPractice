
import java.util.Arrays;
import java.util.Collections;

public class FlipIt {

    public static void flipItVerticalAxis(int[][] matrix) {


        //A for loop going through the rows of the loop.
        for (int row = 0; row < matrix.length; row++){
            int columnLeft = 0;
            int columnRight = (matrix[0].length - 1);
            int temp = 0;
            while (columnLeft <= columnRight){
                temp = matrix[row][columnLeft];
                matrix[row][columnLeft] = matrix[row][columnRight];
                matrix[row][columnRight] = temp;
                columnLeft++;
                columnRight--;
            }
        }
    }

    public static void toStringMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1,0,0}, {0,0,1}};
        int[][] matrix2 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrix3 = {{1,0}};

        toStringMatrix(matrix1);
        toStringMatrix(matrix2);
        toStringMatrix(matrix3);

        System.out.println("------------------FLIPPING---------------------");

        flipItVerticalAxis(matrix1);
        flipItVerticalAxis(matrix2);
        flipItVerticalAxis(matrix3);

        toStringMatrix(matrix1);
        toStringMatrix(matrix2);
        toStringMatrix(matrix3);
    }
}
